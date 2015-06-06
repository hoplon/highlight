(set-env!
  :source-paths #{"src"}
  :dependencies '[[adzerk/bootlaces          "0.1.11"         :scope "test"]
                  [tailrecursion/boot-hoplon "0.1.0-SNAPSHOT"]
                  [tailrecursion/hoplon      "6.0.0-alpha2"]
                  [cljsjs/highlight          "8.4-0"]])

(require
  '[adzerk.bootlaces :refer :all]
  '[tailrecursion.boot-hoplon :refer [hoplon]])

(def +version+ "8.4.0-0")

(task-options!
 pom  {:project     'hoplon/highlight
       :version     +version+
       :description "Hoplon wrapper for highlight.js"
       :url         "https://highlightjs.org/"
       :scm         {:url "https://github.com/hoplon/highlight"}
       :license     {"EPL" "http://opensource.org/licenses/eclipse-1.0.php"}}
 hoplon {:lib true})
