;; Anything you type in here will be executed
;; immediately with the results shown on the
;; right.

; Maps are great - key value pairs!

(def testMap {:first "Jade",
              :middle "Awesome",
              :last "Feng",
              :occupation "Awesome Cake Eater"
              }
)

(get testMap :first)
; This pulls out the value for the key :first

(testMap :first)
(:first testMap)

(get testMap :first :MISS)
(get testMap :orange :MISS)
; the :MISS will yield MISS if there is nothing found

;; Map functions~
(assoc {:first "Sally"} :last "Brown")

(dissoc {:first "Sally" :last "Brown"} :last)

(merge {:first "Sally"} {:last "Brown"})

(count {:first "Sally" :last "Brown"})

(count testMap)
(keys testMap)
(vals testMap)
(def testMap2 ( merge (keys testMap) (vals testMap)))

; Modelling myself

(def myself {:first "Jade",
             :last "Feng",
             :height 168,
             :awesome true,
             :fav-food "sushi"
             } )

(def myself( merge myself {:hometown "Sydney"}) )
(def myself (assoc myself :fav-drink "Orange juice") )

myself

; Collections of collections
[ {:name "Mercury"}
  {:name "Venus"}
  {:name "Earth" :moons ["Best Moon Ever"]}
  {:name "Mars" :moons ["Phobos" "Deimos"]}
  {:name "Jupiter" :moons ["Ganymede" "Callisto" "Io" "Europa"]}
]

 ; Get the names of people
(defn return-name
  [ map ]
  ( str (map :first) " " (map :last) )
)

(return-name myself)

(defn get-names
  [ names ]
  ( map return-name names)
)

(get-names [{:first "Margaret" :last "Atwood"}
            {:first "Doris" :last "Lessing"}
            {:first "Ursula" :last "Le Guin"}
            {:first "Alice" :last "Munro"}
            ]
)

; Modelling your classmates

(def tanya {:first "Tanya" :last "Butenko" :hometown "Dnipo"} )
(def niki {:first "Niki" :last "Butenko" :hometown "Dnipo"} )

(def everyone-else (vector tanya niki))

(def everyone (conj everyone-else myself))
everyone

(def everyone2 (vector everyone-else myself))
everyone2

(get-names everyone)


