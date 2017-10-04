(ns app-with-view-tests.core-test
  (:require [app-with-view-tests.core :as core]
            [cljs.test :refer [deftest is]]))

;; (defn example-test []
;;   (it
;;    "works"
;;    (fn []
;;      (.toBe
;;       (expect 1)
;;       1))))

(deftest example-test
  (is (= 1 0)))
