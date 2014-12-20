;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

(defn total-bill
  "Given subtotal of bill, return total after tax."
  [subtotal]
  (* 1.10 subtotal)
)

; (defn
;     total-bill
;     input variable
;     function to be executed
; )

(total-bill 8.5)
(total-bill 10.0)

; Modify our total-with-tip function, and call the new function share-per-person,
; that additionally takes in as an argument the number of people in the group for a bill.
; Have the function return the average bill amount per person.

(defn share-per-person
  "Given subtotal of bill, find total after tax and divides by # of people in group."
  [ subtotal totalPeople ]
  ( / (* 1.10 subtotal) totalPeople)
)

(share-per-person 100 10)

; MAP - function that takes another function
(def orders [12 14 31 23])
(map total-bill orders)

; REDUCE - can turn collections into a single value
(defn add
  [x y]
  (+ x y)
)

(def takeout-totals [12 14 12 41])
(reduce add takeout-totals)
; A bit like a forloop that adds up each element in the variable




(def bill [12 14 12 52 53])

; This needs to happen inside function
(def bill-count (count bill))

(defn sum
  [x y]
  (+ x y )
)

(defn total
  [ x ]
  (reduce sum x)
)

; Recreated in a function
(defn average-function
  [ bills ]
  ( / (total bills ) (count bills ) )
)


(average-function bill)

