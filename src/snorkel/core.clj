(ns beachball.core
  (:use compojure.core)
  (:require [compojure.route :as route]))


(defroutes user-routes
  (GET "/" [] "Gangplank!")
  (route/not-found "Lost! Like a JWALD."))
