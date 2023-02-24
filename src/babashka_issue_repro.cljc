(ns babashka-issue-repro
  (:require [clojure.string :as string]
            [babashka-issue-repro.lib :as lib])
  #? (:clj (:import babashka_issue_repro.lib.Rec)))

;;Works in all (Clojure, recent Babashka, and earlier Babashka)

(println (Rec. "Hello" "World"))

;;Works in Clojure and Babashka prior to 1.0.169 

(println (lib/Rec. "Hello" "World"))
