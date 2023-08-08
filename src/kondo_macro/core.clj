(ns kondo-macro.core
  (:require [metrics.histograms :as histo]))

(histo/defhistogram sample)
