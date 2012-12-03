(ns clj-fix.core
  (:use clj-fix.connection.protocol)
  (:require (clojure [string :as s])
            (lamina [core :as l])
            (aleph [tcp :as a])
            (gloss [core :as g])))


(defrecord FixConn [id]
  Connection
  (connect [id])

  (logon [id msg-handler heartbeat-interval])

  (buy [id size instrument-symbol price & additional-params])

  (sell [id size instrument-symbol price & additional-params])

  (cancel [id order])

  (cancel-replace [id order & additional-params])

  (order-status [id order])

  (logout [id reason]))