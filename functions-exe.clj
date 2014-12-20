;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

(def bills [12 14 12 14 12] )

(defn sum
  [x y ]
  (+ x y )
)

(defn total
  [ bills ]
  (reduce sum bills)
)

(defn count-sum
  [ x y ]
  ( + x 1 )
)

(defn count2
  [bills]
  (reduce count-sum 0 bills)
)

(defn average
  [bills]
  (/ (total bills) (count2 bills) )
)

(average bills)