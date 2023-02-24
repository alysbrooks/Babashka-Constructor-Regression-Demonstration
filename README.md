
Trivial sample to reproduce [Babashka Issue 1502](https://github.com/babashka/babashka/issues/1502).


The following works:

```
clojure src/babashka_issue_repro.cljc

```

But in later versions of Babashka, the following does not:

```
bb rc/babashka_issue_repro.cljc

``
