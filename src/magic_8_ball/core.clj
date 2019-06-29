(ns magic-8-ball.core
  (:gen-class)
  (:require
   [magic-8-ball.magic-8-ball :as magic8ball]))



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Peering into the future...")
  (magic8ball/fortunes))
