;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.
(max 1 2)

(vector? [5 10 2])
; Testing if it is a vector

(vector 5 10 15)
; turn the values into a vector

(conj [5 10] 12)
; conjugate vectors and elements together

(count [1 2 3])
(nth [5 12 1] 2)
; finds the nth element in the vector i.e. at position 2
(first [1 12 5])


(nth [23 27 28 27 29 29 26 25] 3)

(def sydney-weather [27 28 27 29 29 26 25])
(nth sydney-weather 2)

; using maps
(def weather { :sunday 27 :monday 28 :tuesday 27 :wednesday 29 :thursday 29 :friday 26 :saturday 25 })
(weather :tuesday )
