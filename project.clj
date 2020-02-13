(defproject jess "0.1.0-SNAPSHOT"
  :description "Minimalistic boilerplate for kekkonen"
  :dependencies [[org.clojure/clojure "1.8.0"];1.10.0
                 [http-kit "2.3.0"]
                 ;https://github.com/metosin/kekkonen/issues/57
                 [metosin/kekkonen "0.3.2"];0.5.2
                 [prismatic/schema "1.1.12"]
                 [environ "1.1.0"]]

  :min-lein-version "2.0.0"
  :main jess.main
  :profiles {:uberjar {:aot [jess.main]
                       :main jess.main
                       :uberjar-name "jess.jar"}})
