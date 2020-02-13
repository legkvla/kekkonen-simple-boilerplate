(ns jess.main
  (:require [org.httpkit.server :as server]
            [jess.handler :as handler]
            [jess.system :as system])
  (:gen-class))

(defn make-app [] (handler/create (system/new-system)))

(defn -main [& [port]]
  (let [port (or port 3000)]
    (server/run-server
      (make-app)
      {:port port})
    (println "Server started on port " port)))
