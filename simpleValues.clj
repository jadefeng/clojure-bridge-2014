;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

"Hello world"

(def my-hometown "Sydney")

(require 'clojure.string)

(defn capital
  [ word ]
  (clojure.string/capitalize word)
)

(defn format-name
  [first-name last-name]
  (str ( capital last-name) ", "  (capital first-name ) )
)

(format-name "jade" "feng" )

true;
nil;


(str 1 " " 2)
(str "hello" " " "world")

(format-name "Hello" "World")

; (defn format-any [names] )
; (defn format-name [first last] (format-any [first last]))




