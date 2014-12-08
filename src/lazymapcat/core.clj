(ns lazymapcat.core)

(defn lazymapcat
  "Only applies one at a time."
  [f coll]
  (lazy-seq
    (if (empty? coll)
      '()
      (concat (f (first coll))
              (lazymapcat f (rest coll))))))
