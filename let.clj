; let is like def, but it has limited scope within the function
; def is a global variable -- accessible anywhere in the program
(defn spread
  [numbers]
  (let [largest (reduce max numbers)
        smallest (reduce min numbers)]
    (- largest smallest)
  )
)

(spread [100 7 12 5 3 0])

; rewrite average
(defn average
  [ numbers ]
  ( let [ total ( reduce (fn [x y] (+ x y ) ) numbers )
          countNumbers ( count numbers  )]
    ( / total countNumbers)
  )
)

(average [1 2 3 4 5 6 ])

; Ordinal numbers
(mod -10 3)
(mod 10 3)
(rem -10 3)
(rem -10.0 3)
(rem 10 3)


(defn ordinal
  [ num ]
  ( let [lastNum (rem num 10)]
   ( cond
     ( = num 11) "11th"
     ( = num 12) "12th"
     ( = num 13) "13th"
     ( = lastNum 1 ) (str num "st")
     ( = lastNum 2 ) (str num "nd")
     ( = lastNum 3 ) (str num "rd")
     :else (str num "th")
    )
  )
)

(ordinal 1)  ;=> "1st"
(ordinal 2)  ;=> "2nd"
(ordinal 3)  ;=> "3rd"
(ordinal 4)  ;=> "4th"
(ordinal 5)  ;=> "5th"
(ordinal 21) ;=> "21st"
(ordinal 22) ;=> "22nd"

(ordinal 10) ;=> "10th"
(ordinal 11) ;=> "11th"
(ordinal 12) ;=> "12th"
(ordinal 13) ;=> "13th"
(ordinal 14) ;=> "14th"

; Repeat without using cond
(def suffix { 1 "st",
              2 "nd",
              3 "rd",
              4 "th",
              5 "th",
              6 "th",
              7 "th",
              8 "th",
              9 "th",
              0 "th"
            }
)

(use ['clojure.string :only '(split)])

; Convert number into a string and turn into a sequence and find the last character and back to integer again lol
(defn last-num
  "Convert number into a string and turn into a sequence and find the last character and back to integer again lol"
  [ number ]
  (mod number 10)
  ;(read-string (str (last (seq ( str number )))))
)

; compare with the map suffix
(defn ordinal2
  [ num ]
  (
    let [suffixValue (get suffix (last-num num))]
   (str num suffixValue)
   )
)

(ordinal2 20)
(ordinal2 1)
(ordinal2 22)
(ordinal2 33)

; original number input + suffix value


(def test {1 "teapot" :2 "orange"})
(get test 1)



