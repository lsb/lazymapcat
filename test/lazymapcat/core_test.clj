(ns lazymapcat.core-test
  (:require [clojure.test :refer :all]
            [lazymapcat.core :refer :all]))

(defn six-div-list [i] [(/ 6 i)])

(deftest correctness
  (testing "does lazymapcat behave like mapcat"
    (is (= (lazymapcat six-div-list [2 3 2 1 6])
           (    mapcat six-div-list [2 3 2 1 6])))))

(deftest laziness
  (testing "is lazymapcat as lazy as it can be"
    (is (= 3 (first (lazymapcat six-div-list [2 0 0 0 0]))))))

(deftest necessity
  (testing "is mapcat still busted"
    (is (try
          (and (mapcat six-div-list [2 0 0 0 0]) false)
          (catch ArithmeticException e true)))))