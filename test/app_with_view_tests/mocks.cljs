(ns app-with-view-tests.mocks)

(.mock
 jest
 "LayoutAnimation")

(.mock
 jest
 "WebView"
 (fn [] "WebView"))

(.unmock
 jest
 "ScrollView")
