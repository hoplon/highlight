(set-env!
 :resource-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.9.0-alpha15" :scope "provided"]
                 [org.clojure/clojurescript "1.9.521" :scope "provided"]

                 [adzerk/boot-cljs "1.7.228-1" :scope "test"]


                 [hoplon "6.0.0-alpha17" :scope "provided"]

                 [cljsjs/highlight "8.4-0"]])

(task-options!
  pom {:project 'hoplon/highlight
       :version "8.4.0-0"
       :description "Hoplon wrapper for highlight.js"
       :url "https://highlightjs.org/"
       :scm {:url "https://github.com/hoplon/highlight"}
       :license {"EPL" "http://www.eclipse.org/legal/epl-v10.html"}}
  push {:repo "deploy-clojars"})

(deftask local-install []
  "Build and install the project locally."
  (comp
    (pom)
    (jar)
    (install)))

(deftask release []
  (merge-env!
    :repositories [["deploy-clojars" {:url "https://clojars.org/repo"
                                      :username (System/getenv "CLOJARS_USER")
                                      :password (System/getenv "CLOJARS_PASS")}]])
  (comp
    (local-install)
    (sift :include [#".*\.jar"])
    (push)))
