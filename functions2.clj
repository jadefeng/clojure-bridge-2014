;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

; boolean functions -- comparison functions
(defn meaning-of-life
  [x]
  (= x 42)
)

(meaning-of-life 42)

(str "chocolate" ", " "strawberry" ", and " "vanilla")

(> 4 3)

(require 'clojure.string)

(defn upper
  [ word ]
  (clojure.string/upper-case word)
)

(defn join-with-space
  [string1 string2]
  (str (upper string1) " " (upper string2))
)

(reduce join-with-space ["i" "like" "peanut" "butter" "and" "jelly"])

; Anonymous functions - when you don't want to actually write a specific function for this

(map (fn [x] (* 3 x)) [1 2 3])
; shortcup method of writing anon functions
(map #( * 3 %) [1 2 3])

(reduce (fn [st1 st2] (str st1 " " st2)) ["I" "like" "peanut" "butter"] )


(< 1 5 9) ;This is strictly increasing
(< 1 9 5) ; This is not strictly increasing
