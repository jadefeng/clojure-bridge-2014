;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

(require '[clojure.string :as str])


;; With the join map function
(str/join " " ["hello" "moto" "umbrella"])

(defn join
  [ words ]
  (str/join " " words )
)

(join ["orange" "juice" "ice"])


(defn format-name
  [ name-map order ]
  (if (= order :last)
    (if (:middle name-map)
      (join [(:last name-map) "," (:middle name-map) (:first name-map)] )
      (join [(:last name-map) "," (:last name-map)])
     )
    (if (:middle name-map)
      (join [(:first name-map) (:middle name-map) (:last name-map)] )
      (join [(:first name-map) (:last name-map)])
     )
  )
)


(format-name {:first "Margaret" :last "Atwood"} :last)
(format-name {:first "Ursula" :last "Le Guin" :middle "K."}, :first )

(and (= 1 1) (= 1 2 ))
(or (= 1 1) (= 1 2 ))

(defn format-name2
  [name-map order]
  (cond
     (and (= order :last) (name-map :middle))(str (name-map :last) ", " (name-map :middle) " " ( name-map :first))
     (= order :last) (str (name-map :last) ", " (name-map :first))
     (name-map :middle) (join [(name-map :first) (name-map :middle) (name-map :last)])
     :else (join [(name-map :first) (name-map :last)])
   )
)

(format-name2 {:first "Margaret" :last "Atwood"} :last)
(format-name2 {:first "Margaret" :last "Atwood"} "else")
(format-name {:first "Ursula" :last "Le Guin" :middle "K."}, :last )
(format-name {:first "Ursula" :last "Le Guin" :middle "K."}, :first )

