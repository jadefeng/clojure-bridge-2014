;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(str "hello" " " "world")

(require '[clojure.string :as str])


;; With the join map function
(str/join " " ["hello" "moto" "umbrella"])

(defn join
  [ words ]
  (str/join " " words )
)

(join ["orange" "juice" "ice"])


(defn format-name
  [ map ]
  (
   if (:middle map)
    (join [(:first map) (:middle map) (:last map)] )
    (join [(:first map) (:last map)])
  )
)

(format-name {:first "Margaret" :last "Atwood"})
(format-name {:first "Ursula" :last "Le Guin" :middle "K."})

