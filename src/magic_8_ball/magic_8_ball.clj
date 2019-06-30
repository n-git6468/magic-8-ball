(ns magic-8-ball.magic-8-ball)



(def potential-fortunes ["It is certain!" "It is decidedly so!" "Yes" "Reply hazy try again" "Concentrate & ask again!" "My reply is no" "Outlook is not so good" "Very doubtful!"])

(defn fortunes []
  (->> potential-fortunes count rand-int (nth potential-fortunes) print))
