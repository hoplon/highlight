(ns hoplon.highlight
  (:require
    [cljsjs.highlight]
    [hoplon.core :as h]
    [javelin.core :as j]))

(h/defelem highlight
  "Element for highlighting code. Class is passed to the code element for
  choosing the language."
  [{:keys [class]} kids]
  (j/with-let [c (h/pre (apply (h/code :class class) kids))]
    (h/with-init!
      (.highlightBlock js/hljs c))))

(defn highlight-pre-code
  "Side-efectful. Highlights all code elements inside pre elements. Those needs
  to be in the DOM when this fuction is called."
  []
  (.each (js/jQuery "pre code")
    (fn [i block] (.highlightBlock js/hljs block))))
