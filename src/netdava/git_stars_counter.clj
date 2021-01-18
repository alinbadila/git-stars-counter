(ns netdava.git-stars-counter
  (:require [tentacles.users :as tu]
            [tentacles.core :as tc]
            [environ.core :refer [env]])
  (:gen-class))

(defn get-stars 
  []
  (tc/api-call :get "user/starred" nil {:auth (tc/environ-auth env)}))

(defn -main
  "I don't do a whole lot ... yet."
  [&args]
  (get-stars))
  

(comment
  ;; (System/getProperty "user.home")
  ;; (get-stars "alinbadila" "test")
  ;; (println env)
  (tc/environ-auth env)
  (get-stars)
  (tu/user {:auth (tc/environ-auth env)})
  )