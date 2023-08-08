(ns metrics.histograms)

(defmacro defhistogram
  ([_registry histogram-name] `(defhistogram ~histogram-name))
  ([histogram-name]
   `(def ~histogram-name "histogram")))