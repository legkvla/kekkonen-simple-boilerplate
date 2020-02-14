(ns jess.logging
  (:require
            [plumbing.core :refer [defnk]]))

(defnk request-logging
  [request :as context]
  (do
    (println (str
               (java.time.LocalDateTime/now) " >>>>>>> "
               (-> request :request-method name) " "
               (:uri request)))
    (println "Query params: " (:query-params request))
    (println "Body params: " (:body-params request))
    (println "All params: " (:params request))
    (println "Content type -- length: "
      (:content-type request) " -- " (:content-length request))
    ; (println "Available keys: " (keys request))
    (println "================================================================")
    context))
