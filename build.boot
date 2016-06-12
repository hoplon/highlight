(set-env!
 :resource-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.9.0-alpha5" :scope "provided"]

                 [org.clojure/clojurescript "1.9.36" :scope "provided"]
                 [adzerk/boot-cljs "1.7.228-1" :scope "provided"]

                 [adzerk/bootlaces "0.1.13" :scope "test"]

                 [hoplon "6.0.0-alpha16" :scope "provided"]
                 [hoplon/boot-hoplon "0.1.13" :scope "provided"]

                 [cljsjs/highlight "8.4-0"]])

(require
 '[adzerk.bootlaces :refer :all]
 '[hoplon.boot-hoplon :refer [hoplon]])

(def +version+ "8.4.0-0")

(task-options!
 pom  {:project     'hoplon/highlight
       :version     +version+
       :description "Hoplon wrapper for highlight.js"
       :url         "https://highlightjs.org/"
       :scm         {:url "https://github.com/hoplon/highlight"}
       :license     {"EPL" "http://opensource.org/licenses/eclipse-1.0.php"}}
 hoplon {:manifest true})
