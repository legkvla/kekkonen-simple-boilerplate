(ns jess.system
  (:require
            [jess.handler :as handler]))

(defn new-system []
  {:state {:counter (atom 0) :file (atom nil)}})
