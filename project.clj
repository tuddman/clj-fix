(defproject clj-fix "0.6.4-SNAPSHOT"
  :description "A Clojure API for FIX communication"
  :url "https://github.com/tuddman/clj-fix"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.namespace "0.2.10"]
                 [aleph "0.4.0"] 
                 [cheshire "5.4.0"] 
                 [clj-time "0.9.0"]
                 [edw/ordered "1.3.2"]
                 [fix-translator "1.06-SNAPSHOT"]
                 [gloss "0.2.5"]
                 [manifold "0.1.0"]]
  :main clj-fix.core
  :aot [clj-fix.core])
