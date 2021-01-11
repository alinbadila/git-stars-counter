(ns netdava.git-stars-counter
  (:require [tentacles/tentacles.repos :as repos])
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  ([]
   (println "Hello, World!"))
  ([username] 
   (println "Hello" username)))

(comment
  (-main)
  (-main "alinbadila")
  (repos/user-repos "alinbadila")
  )