package com.alcorp.submission.util

import com.alcorp.submission.R
import com.alcorp.submission.model.Ship

object ShipData {
    private val shipName = arrayOf(
        "Hermelin",
        "Sampson",
        "St. Louis",
        "Orion",
        "Kongo",
        "Ernst Gaede",
        "Helena",
        "Richelieu",
        "Fletcher",
        "Conqueror"
    )

    private val shipDesc = arrayOf(
        "Tier I is basically it’s own game. There’s only cruisers, they only have HE shells, and have no other abilities besides repair party. Also, playing in a tier I ship, you will never come across anything but other tier Is. That being said, tier I ships don’t have enough differences for it to really matter. I put the Hermelin on top though, because it’s fast, and it shoots fast. Being a little faster makes it a lot more fun to play compared to the others, which feel like they broke down and now you have to paddle them.",
        "You’re going to see a lot of American destroyers on this list, because simply, they’re just the safest destroyers to play. Focusing on guns while having plenty of torpedoes to back them up, American destroyers will bully others off of capture points if not outright kill them. They also have some of the best smoke in the game which is great for supporting your team.",
        "The St. Louis wins tier III for the same reason the Dresden won tier II. It has 10 guns, with less rate of fire, but with more damage per shell. The St. Louis moves very slow but is actually able to fight battleships pretty easily with how much firepower St. Louis has. In higher tiers, the low maneuverability would be a huge downside to just about any cruiser but in tier III it honestly doesn’t matter.",
        "Like American destroyers, you’ll see a lot of U.K. battleships on this list. The main thing making them so strong is high fire chance, but they have pretty good guns in general and pretty thick armor too. Oh yeah, and they have the strongest heal in the game which can refill up to about 50% of your missing health at higher tiers. The fire chance is a big deal because battleships especially are hard to deal damage to so lighting a couple fires is the safest way do kill them. And the maybe the most annoying way for them to die.",
        "The Kongo is a great example of Japanese battleships. Kongo very fun with long range and great maneuverability for a battleship. Although her armor is lacking, kongo got a big health pool and enough range that you shouldn’t be getting hit too often. Kongo is a fan favorite and for good reason, if your goal with a battleship is to deal a lot of damage instead of take a lot, you’ll enjoy the Japanese line and definitely the Kongo.",
        "The Gaede can equip guns as big as some cruisers. Since the Americans have been winning out most destroyer spots because of their guns, it shouldn’t come as much of a surprise why the Gaede is here. The light cruiser sized guns and a bigger health pool causes this to be more like a “very light cruiser” that also has some nice torpedoes with good range. Gaede still has the option to use destroyer sized guns and the versatility makes for a fun ship.",
        "While pretty much everyone is upgraded to heavy cruisers, it might seem strange that a light cruiser takes tier VII. Helena has 15 guns which gives her high damage potential as long as you keep her from getting hit. Along those lines, helena has good concealment and maneuverability so if you play right, you shouldn’t be getting hit too much.",
        "If you take a look at the image above, you might notice that all the big guns are on the front of this ship. That means richelieu doesn’t need to turn at all to shoot them. And that means, richelieu will rarely give an angle that you can effectively do any damage against. richelieu also has long range, and high speed. If played correctly the Richelieu is a hard ship to kill, and the longer richelieu’s alive, the more damage richelieu can potentially put out.",
        "The Fletcher gets torpedos that are over 10 kilometers in range, and that puts her about on par with the Japanese torpedo boats while keeping the great American guns.  Along with some good speed and great maneuverability, the fletcher is very annoying to play against for destroyers and battleships alike.",
        "The Conqueror has very very high fire chance and a great heal. Conqueror got thick armor, and decent speed for her size. Shooting anything at that long range is extremely difficult, anyway. If you want a ship that is consistent and will do well every single game almost regardless of your aim (although, obviously you still need to hit them), play Conqueror."
    )

    private val shipClass = arrayOf(
        "Cruiser",
        "Destroyer",
        "Cruiser",
        "Battleship",
        "Battleship",
        "Destroyer",
        "Cruiser",
        "Battleship",
        "Destroyer",
        "Battleship"
    )

    private val shipCountry = arrayOf(
        "Germany",
        "U.S.A.",
        "U.S.A.",
        "U.K.",
        "Japan",
        "Germany",
        "U.S.A.",
        "France",
        "U.S.A.",
        "U.K."
    )

    private val shipPhoto = intArrayOf(
        R.drawable.hermelin,
        R.drawable.sampson,
        R.drawable.st_louis,
        R.drawable.orion,
        R.drawable.kongo,
        R.drawable.ernst_gaede,
        R.drawable.helena,
        R.drawable.richelieu,
        R.drawable.fletcher,
        R.drawable.conqueror
    )

    val getListData: ArrayList<Ship>
        get() {
            val listShip = ArrayList<Ship>()
            for (i in shipName.indices) {
                val ship = Ship(shipName[i], shipClass[i], shipCountry[i], shipDesc[i], shipPhoto[i])
                listShip.add(ship)
            }
            return listShip
        }
}
