package info.elaina.bili.api.relation

data class Relation(
    val code: Int,
    val message: String,
    val ttl: Int,
    val data: RelationData
)
