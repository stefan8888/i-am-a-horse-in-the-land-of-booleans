(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if (or (= x false) (= x nil)) false true))

(defn abs [x]
  (if (< x 0)
    (- x)
    x))

(defn divides? [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz [n]
  (cond
   (and (divides? 3 n) (not(divides? 15 n))) "fizz"
   (and (divides? 5 n) (not(divides? 15 n))) "buzz"
   (divides? 15 n) "gotcha!"
   :else ""))


(defn teen? [age]
  (if (<= 13 age 19) true false))

(defn not-teen? [age]
  (if (teen? age) false true))

(defn generic-doublificate [x]
  (cond
   (number? x) (* 2 x)
   (empty? x) nil
   (or (list? x) (vector? x)) (* 2 (count x))
   :else true))

(defn leap-year? [year]
  (cond
   (and (divides? 4 year) (not (divides? 100 year))) true
   (and (divides? 4 year) (divides? 400 year)) true
   :else false))

; '_______'
