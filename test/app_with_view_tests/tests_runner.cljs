(ns app-with-view-tests.tests-runner
  (:require [cljs.nodejs :as nodejs]
            [app-with-view-tests.core-test :as core]))

;; (def jest (nodejs/require "jest"))

(enable-console-print!)

;; (.mock jest "WebView" (fn [] "WebView"))
(core/example-test)
