(ns clojure.test.example
  (:use clojure.test)
  (:require src.fizzbuzz))

(deftest returns-1-for-1
  (is (= "1" (fizzbuzz 1))))

(deftest returns-2-for-2
  (is (= "2" (fizzbuzz 2))))

(deftest returns-fizz-for-3
  (is (= "fizz" (fizzbuzz 3))))

(deftest returns-buzz-for-5
  (is (= "buzz" (fizzbuzz 5))))

(deftest returns-fizz-for-6
  (is (= "fizz" (fizzbuzz 6))))

(deftest returns-buzz-for-10
  (is (= "buzz" (fizzbuzz 10))))

(deftest returns-fizzbuzz-for-15
  (is (= "fizzbuzz" (fizzbuzz 15))))

(deftest returns-fizzbuzz-for-30
  (is (= "fizzbuzz" (fizzbuzz 30))))

(run-all-tests #"clojure.test.example")
