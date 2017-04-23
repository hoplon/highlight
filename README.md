# Hoplon Highlight
A wrapper to use highlight-js on Hoplon projects

# Latest version
[](dependency)
```clojure
[hoplon/highlight "8.4.0-0"] ;; latest release
```
[](/dependency)

# Usage
```clojure
(ns application.core
  (:require [hoplon.highlight :as hl]))

;; This will create a <pre> <code> block with the code on the string highlighted
(hl/highlight "(defn abc [x]\n  (str x))")

;; This will find every <pre> <code> block and highlight it
(hl/highlight-pre-code)
```
