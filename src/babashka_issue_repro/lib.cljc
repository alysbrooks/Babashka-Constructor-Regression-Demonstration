(ns babashka-issue-repro.lib)

(defrecord Rec [foo bar]
  Object
  (toString [this]
    (str (:foo this))))
