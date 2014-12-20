;(if (valid? data) ;; Conditional expression
;  (save! data)    ;; expression if true
;  (error "Your data is invalid")  ;; expression if false
;)

(require '[clojure.string :as str])

( if (> 3 1)
  "3 is greater than 1. I like orange juice."
  "I hate orange juice"
)


; truthy toothy hurty
"Everything except /false/ or /nil/"

(defn format-name
  [ map ]
  (if (:middle map)
    (str (:first map) " " (:middle map) " " (:last map) )
    (str (:first map) " " (:last map) )
  )
)


(format-name {:first "Margaret" :last "Atwood"})
(format-name {:first "Ursula" :last "Le Guin" :middle "K."})

