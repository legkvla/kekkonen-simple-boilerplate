(ns jess.security

  (:require
    [clojure.set :as set]
    [environ.core :refer [env]]
    [kekkonen.cqrs :refer [failure!]]))

(defn api-key-authenticator [context]
  (let [api-key (-> context :request :query-params :api_key)
        user (condp = api-key
               (env :user-token) {:name "user" :roles #{:user}}
               (env :master-token) {:name "master" :roles #{:master}}
               nil)]
    (assoc context :user user)))

(defn require-roles [required]
  (fn [context]
    (let [roles (-> context :user :roles)]
      (if (seq (set/intersection roles required))
        context
        (failure! {:status :not-authorized-403})))))
