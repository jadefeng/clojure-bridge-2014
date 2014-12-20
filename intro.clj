;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

;; Example 1
(def jade 168)
jade
(def cmPerInch 2.54)
(/ jade cmPerInch)
(def jadeInInches (/ jade cmPerInch) )
jadeInInches
(def sammy 160)
(def justin 171)
(def totalHeight (+ jade sammy justin))
totalHeight
(def averageHeight (/ totalHeight 3.0 ))
(def averageHeightInInches (/ averageHeight cmPerInch) )
(def cmInFeet 30.48)
(def averageHeightInFeet (quot averageHeightInInches 12.0))
(def averageHeightInchesLeft (mod averageHeightInInches 12.0))
;; average height is 5 feet and 5.5 inches

(def my-name :jade)
"Bonjour! Ca va madamoiselle."

(vector? 2)
