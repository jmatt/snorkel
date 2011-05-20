(defproject snorkel "0.0.1-SNAPSHOT"
  :description "Users use snorkels."
  :url "https://github.com/jmatt/snorkel"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [ring "0.3.7"]
                 [compojure "0.6.3"]
                 [sandbar/sandbar "0.4.0-SNAPSHOT"]
                 [hiccup "0.3.5"]
                 [inflections "0.4.2-SNAPSHOT"]
                 [clj-time "0.3.0"]]
  :dev-dependencies [[swank-clojure "1.4.0-SNAPSHOT"]
                     [clojure-source "1.2.0"]
                     [lein-ring "0.4.0"] ;ideally use one or other...
                     [ring-serve "0.1.1"]
                     [marginalia "0.5.0"]]
  :jvm-opts ["-agentlib:jdwp=transport=dt_socket,server=y,suspend=n"]
  :ring {:handler snorkel.core/user-routes}
    :resources-path "resources")
