package project.lonelywheeler.db.entity.liked

data class LikedOfferEntity
constructor(
    val userId: String,
    val offerId: String,
    val entityType: String
)