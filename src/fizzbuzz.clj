(defn fizz? [x] (zero? (mod x 3)))
(defn buzz? [x] (zero? (mod x 5)))
(defn fizzbuzz? [x] (and (fizz? x) (buzz? x)))

(defn fizzbuzz [x] 
  (if (fizzbuzz? x) "fizzbuzz" 
    (if (buzz? x) "buzz"
      (if (fizz? x) "fizz" (str x)))))
