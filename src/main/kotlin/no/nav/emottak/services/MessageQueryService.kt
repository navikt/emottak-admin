package no.nav.emottak.services

import no.nav.emottak.aksessering.db.getRoles
import no.nav.emottak.aksessering.db.hentMeldinger
import no.nav.emottak.db.DatabaseInterface
import no.nav.emottak.model.MeldingInfo
import no.nav.emottak.model.RoleInfo
import java.time.LocalDateTime

class MessageQueryService(
    private val databaseInterface: DatabaseInterface,
    private val databasePrefix: String
) {
    fun meldinger(fom: LocalDateTime, tom: LocalDateTime): List<MeldingInfo> =
        databaseInterface.hentMeldinger(databasePrefix, fom, tom)
    fun roles(fom: LocalDateTime, tom: LocalDateTime): List<RoleInfo> =
        databaseInterface.getRoles(databasePrefix, fom, tom)
}
