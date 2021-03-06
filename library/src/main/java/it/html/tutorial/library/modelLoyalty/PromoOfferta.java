package it.html.tutorial.library.modelLoyalty;


import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

public class PromoOfferta {
	
	@JsonProperty("id")
	private int id;
	
	@Size(min = 1, max = 25, message = "ID_PROMO_TESTATA out of lenght (min len=1 / max len=25) ")
	@JsonProperty(value="id_promo_testata")
	private String idPromoTestata;
	
	@Size(min = 1, max = 30, message = "DESCRIZIONE out of lenght (min len=1 / max len=30) ")
	@JsonProperty(value="descrizione")
	private String descrizione;
	
	@Size(min = 1, max = 50, message = "CODICE_ESTERNO out of lenght (min len=1 / max len=50) ")
	@JsonProperty(value="codice_esterno")
	private String codiceEsterno;
	
	@Size(min = 1, max = 500, message = "MESSAGGIO_PROMO out of lenght (min len=1 / max len=500) ")
	@JsonProperty(value="messaggio_promo")
	private String messaggioPromo;
	
	@JsonProperty("priorita")
	private int priorita;
	
	@JsonProperty("non_applicabile_ad_articoli_in_altre_promo")
	private int nonApplicabileAdArticoliInAltrePromo;
	
	@JsonProperty("attivazione_richiesta")
	private int attivazioneRichiesta;
	
	@JsonProperty("consenti_esclusione_da_cassa")
	private int consentiEsclusioneDaCassa;
	
	@JsonProperty("id_dispositivo_messaggio")
	private int idDispositivoMessaggio;
	
	@JsonProperty("limite_utilizzo_per_transazione")
	private int limiteUtilizzoPerTransazione;
	
	@JsonProperty("limite_utilizzo_per_giorno")
	private int limiteUtilizzoPerGiorno;
	
	@JsonProperty("limite_utilizzo_per_numero_giorni")
	private int limiteUtilizzoPerNumeroGiorni;
	
	@JsonProperty("giorni_limite_utilizzo")
	private int giorniLimiteUtilizzo;
	
	@JsonProperty("limite_utilizzo_totale")
	private int limiteUtilizzoTotale;
	
	@Size(min = 1, max = 25, message = "ID_GRUPPO_PROMO out of lenght (min len=1 / max len=25) ")
	@JsonProperty(value="id_gruppo_promo")
	private String idGruppoPromo;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("sellout_dal")
	private Date selloutDal;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("sellout_al")
	private Date selloutAl;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("orario_da")
	private Date orarioDa;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("orario_a")
	private Date orarioA;
	
	@JsonProperty("cumulabile_ad_altre_offerte")
	private int cumulabileAdAltreOfferte;
	
	@JsonProperty("lunedž")
	private int lunedž;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("lunedž_orario_da")
	private Date lunedžOrarioDa;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("lunedž_orario_a")
	private Date lunedžOrarioA;

	@JsonProperty("martedž")
	private int martedž;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("martedž_orario_da")
	private Date martedžOrarioDa;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("martedž_orario_a")
	private Date martedžOrarioA;
	
	@JsonProperty("mercoledž")
	private int mercoledž;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("mercoledž_orario_da")
	private Date mercoledžOrarioDa;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("mercoledž_orario_a")
	private Date mercoledžOrarioA;
	
	@JsonProperty("giovedž")
	private int giovedž;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("giovedž_orario_da")
	private Date giovedžOrarioDa;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("giovedž_orario_a")
	private Date giovedžOrarioA;
	
	@JsonProperty("venerdž")
	private int venerdž;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("venerdž_orario_da")
	private Date venerdžOrarioDa;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("venerdž_orario_a")
	private Date venerdžOrarioA;
	
	@JsonProperty("sabato")
	private int sabato;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("sabato_orario_da")
	private Date sabatoOrarioDa;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("sabato_orario_a")
	private Date sabatoOrarioA;
	
	@JsonProperty("domenica")
	private int domenica;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("domenica_orario_da")
	private Date domenicaOrarioDa;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("domenica_orario_a")
	private Date domenicaOrarioA;
	
	@JsonProperty("id_modalita_di_pagamento")
	private int idModalitaDiPagamento;
	
	@Size(min = 1, max = 50, message = "ID_COUPON_VALIDO out of lenght (min len=1 / max len=50) ")
	@JsonProperty(value="id_coupon_valido")
	private String idCouponValido;
	
	@Size(min = 1, max = 24, message = "DISPONIBILITA'_CONNESSIONE out of lenght (min len=1 / max len=24) ")
	@JsonProperty(value="disponibilitŗ_connessione")
	private String disponibilitŗConnessione;
	
	@Size(min = 1, max = 51, message = "ALLOCAZIONE_SCONTO_PER_STAMPA out of lenght (min len=1 / max len=51) ")
	@JsonProperty(value="allocazione_sconto_per_stampa")
	private String allocazioneScontoPerStampa;
	
	@JsonProperty("primo_articolo")
	private int primoArticolo;

	@JsonProperty("articoli_omaggio")
	private int articoliOmaggio;
	
	@JsonProperty("totale_scontrino")
	private int totaleScontrino;
	
	@Size(min = 1, max = 255, message = "NOTE_INTERNE out of lenght (min len=1 / max len=255) ")
	@JsonProperty(value="note_interne")
	private String noteInterne;
	
	@Size(min = 1, max = 40, message = "UTENTE_INSERIMENTO out of lenght (min len=1 / max len=40) ")
	@JsonProperty(value="utente_inserimento")
	private String utenteInserimento;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("data_inserimento")
	private Date dataInserimento;
	
	@Size(min = 1, max = 40, message = "UTENTE_AGGIORNAMENTO out of lenght (min len=1 / max len=40) ")
	@JsonProperty(value="utente_aggiornamento")
	private String utenteAggiornamento;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("data_aggiornamento")
	private Date dataAggiornamento;
	
	@JsonProperty("priorita_best_deal")
	private int prioritaBestDeal;

	@JsonProperty("flag_best_deal")
	private int flagBestDeal;
	
	@JsonProperty("flag_coupon_richiesto")
	private int flagCouponRichiesto;
	
	@JsonProperty("flag_brucia_coupon")
	private int flagBruciaCoupon;
	
	@Size(min = 1, max = 27, message = "TIPO_STAMPA_REDENZIONE out of lenght (min len=1 / max len=27) ")
	@JsonProperty(value="tipo_stampa_redenzione")
	private String tipoStampaRedenzione;
	
	@Size(min = 1, max = 40, message = "TARGET_CLIENTI out of lenght (min len=1 / max len=40) ")
	@JsonProperty(value="target_clienti")
	private String targetClienti;
	
	@Size(min = 1, max = 55, message = "ALLOCAZIONE_SCONTO_VENTILAZIONE out of lenght (min len=1 / max len=55) ")
	@JsonProperty(value="allocazione_sconto_ventilazione")
	private String allocazioneScontoVentilazione;
	
	@JsonProperty("promo_offerta_pdv")
    private List<PromoOffertaPdv> listPromoOffertaPdv;
	
	@JsonProperty("applicazione_merceologica")
    private List<ApplicazioneMerceologica> listApplicazioneMerceologica;
	
	@JsonProperty("applicazione_articolo")
    private List<ApplicazioneArticolo> listApplicazioneArticolo;
	
	@JsonProperty("esclusione_articolo")
    private List<EsclusioneArticolo> listEsclusioneArticolo;
	
	@JsonProperty("promo_scaglione")
    private List<PromoScaglione> listPromoScaglione;
	
	@JsonProperty("promo_segmenti")
    private List<PromoSegmenti> listPromoSegmenti;
	
	@JsonProperty("promo_segmenti_locali")
    private List<PromoSegmentiLocali> listPromoSegmentiLocali;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdPromoTestata() {
		return idPromoTestata;
	}

	public void setIdPromoTestata(String idPromoTestata) {
		this.idPromoTestata = idPromoTestata;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCodiceEsterno() {
		return codiceEsterno;
	}

	public void setCodiceEsterno(String codiceEsterno) {
		this.codiceEsterno = codiceEsterno;
	}

	public String getMessaggioPromo() {
		return messaggioPromo;
	}

	public void setMessaggioPromo(String messaggioPromo) {
		this.messaggioPromo = messaggioPromo;
	}

	public int getPriorita() {
		return priorita;
	}

	public void setPriorita(int priorita) {
		this.priorita = priorita;
	}

	public int getNonApplicabileAdArticoliInAltrePromo() {
		return nonApplicabileAdArticoliInAltrePromo;
	}

	public void setNonApplicabileAdArticoliInAltrePromo(int nonApplicabileAdArticoliInAltrePromo) {
		this.nonApplicabileAdArticoliInAltrePromo = nonApplicabileAdArticoliInAltrePromo;
	}

	public int getAttivazioneRichiesta() {
		return attivazioneRichiesta;
	}

	public void setAttivazioneRichiesta(int attivazioneRichiesta) {
		this.attivazioneRichiesta = attivazioneRichiesta;
	}

	public int getConsentiEsclusioneDaCassa() {
		return consentiEsclusioneDaCassa;
	}

	public void setConsentiEsclusioneDaCassa(int consentiEsclusioneDaCassa) {
		this.consentiEsclusioneDaCassa = consentiEsclusioneDaCassa;
	}

	public int getIdDispositivoMessaggio() {
		return idDispositivoMessaggio;
	}

	public void setIdDispositivoMessaggio(int idDispositivoMessaggio) {
		this.idDispositivoMessaggio = idDispositivoMessaggio;
	}

	public int getLimiteUtilizzoPerTransazione() {
		return limiteUtilizzoPerTransazione;
	}

	public void setLimiteUtilizzoPerTransazione(int limiteUtilizzoPerTransazione) {
		this.limiteUtilizzoPerTransazione = limiteUtilizzoPerTransazione;
	}

	public int getLimiteUtilizzoPerGiorno() {
		return limiteUtilizzoPerGiorno;
	}

	public void setLimiteUtilizzoPerGiorno(int limiteUtilizzoPerGiorno) {
		this.limiteUtilizzoPerGiorno = limiteUtilizzoPerGiorno;
	}

	public int getLimiteUtilizzoPerNumeroGiorni() {
		return limiteUtilizzoPerNumeroGiorni;
	}

	public void setLimiteUtilizzoPerNumeroGiorni(int limiteUtilizzoPerNumeroGiorni) {
		this.limiteUtilizzoPerNumeroGiorni = limiteUtilizzoPerNumeroGiorni;
	}

	public int getGiorniLimiteUtilizzo() {
		return giorniLimiteUtilizzo;
	}

	public void setGiorniLimiteUtilizzo(int giorniLimiteUtilizzo) {
		this.giorniLimiteUtilizzo = giorniLimiteUtilizzo;
	}

	public int getLimiteUtilizzoTotale() {
		return limiteUtilizzoTotale;
	}

	public void setLimiteUtilizzoTotale(int limiteUtilizzoTotale) {
		this.limiteUtilizzoTotale = limiteUtilizzoTotale;
	}

	public String getIdGruppoPromo() {
		return idGruppoPromo;
	}

	public void setIdGruppoPromo(String idGruppoPromo) {
		this.idGruppoPromo = idGruppoPromo;
	}

	public Date getSelloutDal() {
		return selloutDal;
	}

	public void setSelloutDal(Date selloutDal) {
		this.selloutDal = selloutDal;
	}

	public Date getSelloutAl() {
		return selloutAl;
	}

	public void setSelloutAl(Date selloutAl) {
		this.selloutAl = selloutAl;
	}

	public Date getOrarioDa() {
		return orarioDa;
	}

	public void setOrarioDa(Date orarioDa) {
		this.orarioDa = orarioDa;
	}

	public Date getOrarioA() {
		return orarioA;
	}

	public void setOrarioA(Date orarioA) {
		this.orarioA = orarioA;
	}

	public int getCumulabileAdAltreOfferte() {
		return cumulabileAdAltreOfferte;
	}

	public void setCumulabileAdAltreOfferte(int cumulabileAdAltreOfferte) {
		this.cumulabileAdAltreOfferte = cumulabileAdAltreOfferte;
	}

	public int getLunedž() {
		return lunedž;
	}

	public void setLunedž(int lunedž) {
		this.lunedž = lunedž;
	}

	public Date getLunedžOrarioDa() {
		return lunedžOrarioDa;
	}

	public void setLunedžOrarioDa(Date lunedžOrarioDa) {
		this.lunedžOrarioDa = lunedžOrarioDa;
	}

	public Date getLunedžOrarioA() {
		return lunedžOrarioA;
	}

	public void setLunedžOrarioA(Date lunedžOrarioA) {
		this.lunedžOrarioA = lunedžOrarioA;
	}

	public int getMartedž() {
		return martedž;
	}

	public void setMartedž(int martedž) {
		this.martedž = martedž;
	}

	public Date getMartedžOrarioDa() {
		return martedžOrarioDa;
	}

	public void setMartedžOrarioDa(Date martedžOrarioDa) {
		this.martedžOrarioDa = martedžOrarioDa;
	}

	public Date getMartedžOrarioA() {
		return martedžOrarioA;
	}

	public void setMartedžOrarioA(Date martedžOrarioA) {
		this.martedžOrarioA = martedžOrarioA;
	}

	public int getMercoledž() {
		return mercoledž;
	}

	public void setMercoledž(int mercoledž) {
		this.mercoledž = mercoledž;
	}

	public Date getMercoledžOrarioDa() {
		return mercoledžOrarioDa;
	}

	public void setMercoledžOrarioDa(Date mercoledžOrarioDa) {
		this.mercoledžOrarioDa = mercoledžOrarioDa;
	}

	public Date getMercoledžOrarioA() {
		return mercoledžOrarioA;
	}

	public void setMercoledžOrarioA(Date mercoledžOrarioA) {
		this.mercoledžOrarioA = mercoledžOrarioA;
	}

	public int getGiovedž() {
		return giovedž;
	}

	public void setGiovedž(int giovedž) {
		this.giovedž = giovedž;
	}

	public Date getGiovedžOrarioDa() {
		return giovedžOrarioDa;
	}

	public void setGiovedžOrarioDa(Date giovedžOrarioDa) {
		this.giovedžOrarioDa = giovedžOrarioDa;
	}

	public Date getGiovedžOrarioA() {
		return giovedžOrarioA;
	}

	public void setGiovedžOrarioA(Date giovedžOrarioA) {
		this.giovedžOrarioA = giovedžOrarioA;
	}

	public int getVenerdž() {
		return venerdž;
	}

	public void setVenerdž(int venerdž) {
		this.venerdž = venerdž;
	}

	public Date getVenerdžOrarioDa() {
		return venerdžOrarioDa;
	}

	public void setVenerdžOrarioDa(Date venerdžOrarioDa) {
		this.venerdžOrarioDa = venerdžOrarioDa;
	}

	public Date getVenerdžOrarioA() {
		return venerdžOrarioA;
	}

	public void setVenerdžOrarioA(Date venerdžOrarioA) {
		this.venerdžOrarioA = venerdžOrarioA;
	}

	public int getSabato() {
		return sabato;
	}

	public void setSabato(int sabato) {
		this.sabato = sabato;
	}

	public Date getSabatoOrarioDa() {
		return sabatoOrarioDa;
	}

	public void setSabatoOrarioDa(Date sabatoOrarioDa) {
		this.sabatoOrarioDa = sabatoOrarioDa;
	}

	public Date getSabatoOrarioA() {
		return sabatoOrarioA;
	}

	public void setSabatoOrarioA(Date sabatoOrarioA) {
		this.sabatoOrarioA = sabatoOrarioA;
	}

	public int getDomenica() {
		return domenica;
	}

	public void setDomenica(int domenica) {
		this.domenica = domenica;
	}

	public Date getDomenicaOrarioDa() {
		return domenicaOrarioDa;
	}

	public void setDomenicaOrarioDa(Date domenicaOrarioDa) {
		this.domenicaOrarioDa = domenicaOrarioDa;
	}

	public Date getDomenicaOrarioA() {
		return domenicaOrarioA;
	}

	public void setDomenicaOrarioA(Date domenicaOrarioA) {
		this.domenicaOrarioA = domenicaOrarioA;
	}

	public int getIdModalitaDiPagamento() {
		return idModalitaDiPagamento;
	}

	public void setIdModalitaDiPagamento(int idModalitaDiPagamento) {
		this.idModalitaDiPagamento = idModalitaDiPagamento;
	}

	public String getIdCouponValido() {
		return idCouponValido;
	}

	public void setIdCouponValido(String idCouponValido) {
		this.idCouponValido = idCouponValido;
	}

	public String getDisponibilitŗConnessione() {
		return disponibilitŗConnessione;
	}

	public void setDisponibilitŗConnessione(String disponibilitŗConnessione) {
		this.disponibilitŗConnessione = disponibilitŗConnessione;
	}

	public String getAllocazioneScontoPerStampa() {
		return allocazioneScontoPerStampa;
	}

	public void setAllocazioneScontoPerStampa(String allocazioneScontoPerStampa) {
		this.allocazioneScontoPerStampa = allocazioneScontoPerStampa;
	}

	public int getPrimoArticolo() {
		return primoArticolo;
	}

	public void setPrimoArticolo(int primoArticolo) {
		this.primoArticolo = primoArticolo;
	}

	public int getArticoliOmaggio() {
		return articoliOmaggio;
	}

	public void setArticoliOmaggio(int articoliOmaggio) {
		this.articoliOmaggio = articoliOmaggio;
	}

	public int getTotaleScontrino() {
		return totaleScontrino;
	}

	public void setTotaleScontrino(int totaleScontrino) {
		this.totaleScontrino = totaleScontrino;
	}

	public String getNoteInterne() {
		return noteInterne;
	}

	public void setNoteInterne(String noteInterne) {
		this.noteInterne = noteInterne;
	}

	public String getUtenteInserimento() {
		return utenteInserimento;
	}

	public void setUtenteInserimento(String utenteInserimento) {
		this.utenteInserimento = utenteInserimento;
	}

	public Date getDataInserimento() {
		return dataInserimento;
	}

	public void setDataInserimento(Date dataInserimento) {
		this.dataInserimento = dataInserimento;
	}

	public String getUtenteAggiornamento() {
		return utenteAggiornamento;
	}

	public void setUtenteAggiornamento(String utenteAggiornamento) {
		this.utenteAggiornamento = utenteAggiornamento;
	}

	public Date getDataAggiornamento() {
		return dataAggiornamento;
	}

	public void setDataAggiornamento(Date dataAggiornamento) {
		this.dataAggiornamento = dataAggiornamento;
	}

	public int getPrioritaBestDeal() {
		return prioritaBestDeal;
	}

	public void setPrioritaBestDeal(int prioritaBestDeal) {
		this.prioritaBestDeal = prioritaBestDeal;
	}

	public int getFlagBestDeal() {
		return flagBestDeal;
	}

	public void setFlagBestDeal(int flagBestDeal) {
		this.flagBestDeal = flagBestDeal;
	}

	public int getFlagCouponRichiesto() {
		return flagCouponRichiesto;
	}

	public void setFlagCouponRichiesto(int flagCouponRichiesto) {
		this.flagCouponRichiesto = flagCouponRichiesto;
	}

	public int getFlagBruciaCoupon() {
		return flagBruciaCoupon;
	}

	public void setFlagBruciaCoupon(int flagBruciaCoupon) {
		this.flagBruciaCoupon = flagBruciaCoupon;
	}

	public String getTipoStampaRedenzione() {
		return tipoStampaRedenzione;
	}

	public void setTipoStampaRedenzione(String tipoStampaRedenzione) {
		this.tipoStampaRedenzione = tipoStampaRedenzione;
	}

	public String getTargetClienti() {
		return targetClienti;
	}

	public void setTargetClienti(String targetClienti) {
		this.targetClienti = targetClienti;
	}

	public String getAllocazioneScontoVentilazione() {
		return allocazioneScontoVentilazione;
	}

	public void setAllocazioneScontoVentilazione(String allocazioneScontoVentilazione) {
		this.allocazioneScontoVentilazione = allocazioneScontoVentilazione;
	}

	public List<PromoOffertaPdv> getListPromoOffertaPdv() {
		return listPromoOffertaPdv;
	}

	public void setListPromoOffertaPdv(List<PromoOffertaPdv> listPromoOffertaPdv) {
		this.listPromoOffertaPdv = listPromoOffertaPdv;
	}

	public List<ApplicazioneMerceologica> getListApplicazioneMerceologica() {
		return listApplicazioneMerceologica;
	}

	public void setListApplicazioneMerceologica(List<ApplicazioneMerceologica> listApplicazioneMerceologica) {
		this.listApplicazioneMerceologica = listApplicazioneMerceologica;
	}

	public List<ApplicazioneArticolo> getListApplicazioneArticolo() {
		return listApplicazioneArticolo;
	}

	public void setListApplicazioneArticolo(List<ApplicazioneArticolo> listApplicazioneArticolo) {
		this.listApplicazioneArticolo = listApplicazioneArticolo;
	}

	public List<EsclusioneArticolo> getListEsclusioneArticolo() {
		return listEsclusioneArticolo;
	}

	public void setListEsclusioneArticolo(List<EsclusioneArticolo> listEsclusioneArticolo) {
		this.listEsclusioneArticolo = listEsclusioneArticolo;
	}

	public List<PromoScaglione> getListPromoScaglione() {
		return listPromoScaglione;
	}

	public void setListPromoScaglione(List<PromoScaglione> listPromoScaglione) {
		this.listPromoScaglione = listPromoScaglione;
	}

	public List<PromoSegmenti> getListPromoSegmenti() {
		return listPromoSegmenti;
	}

	public void setListPromoSegmenti(List<PromoSegmenti> listPromoSegmenti) {
		this.listPromoSegmenti = listPromoSegmenti;
	}

	public List<PromoSegmentiLocali> getListPromoSegmentiLocali() {
		return listPromoSegmentiLocali;
	}

	public void setListPromoSegmentiLocali(List<PromoSegmentiLocali> listPromoSegmentiLocali) {
		this.listPromoSegmentiLocali = listPromoSegmentiLocali;
	}

	@Override
	public String toString() {
		return "PromoOfferta [id=" + id + ", idPromoTestata=" + idPromoTestata + ", descrizione=" + descrizione
				+ ", codiceEsterno=" + codiceEsterno + ", messaggioPromo=" + messaggioPromo + ", priorita=" + priorita
				+ ", nonApplicabileAdArticoliInAltrePromo=" + nonApplicabileAdArticoliInAltrePromo
				+ ", attivazioneRichiesta=" + attivazioneRichiesta + ", consentiEsclusioneDaCassa="
				+ consentiEsclusioneDaCassa + ", idDispositivoMessaggio=" + idDispositivoMessaggio
				+ ", limiteUtilizzoPerTransazione=" + limiteUtilizzoPerTransazione + ", limiteUtilizzoPerGiorno="
				+ limiteUtilizzoPerGiorno + ", limiteUtilizzoPerNumeroGiorni=" + limiteUtilizzoPerNumeroGiorni
				+ ", giorniLimiteUtilizzo=" + giorniLimiteUtilizzo + ", limiteUtilizzoTotale=" + limiteUtilizzoTotale
				+ ", idGruppoPromo=" + idGruppoPromo + ", selloutDal=" + selloutDal + ", selloutAl=" + selloutAl
				+ ", orarioDa=" + orarioDa + ", orarioA=" + orarioA + ", cumulabileAdAltreOfferte="
				+ cumulabileAdAltreOfferte + ", lunedž=" + lunedž + ", lunedžOrarioDa=" + lunedžOrarioDa
				+ ", lunedžOrarioA=" + lunedžOrarioA + ", martedž=" + martedž + ", martedžOrarioDa=" + martedžOrarioDa
				+ ", martedžOrarioA=" + martedžOrarioA + ", mercoledž=" + mercoledž + ", mercoledžOrarioDa="
				+ mercoledžOrarioDa + ", mercoledžOrarioA=" + mercoledžOrarioA + ", giovedž=" + giovedž
				+ ", giovedžOrarioDa=" + giovedžOrarioDa + ", giovedžOrarioA=" + giovedžOrarioA + ", venerdž=" + venerdž
				+ ", venerdžOrarioDa=" + venerdžOrarioDa + ", venerdžOrarioA=" + venerdžOrarioA + ", sabato=" + sabato
				+ ", sabatoOrarioDa=" + sabatoOrarioDa + ", sabatoOrarioA=" + sabatoOrarioA + ", domenica=" + domenica
				+ ", domenicaOrarioDa=" + domenicaOrarioDa + ", domenicaOrarioA=" + domenicaOrarioA
				+ ", idModalitaDiPagamento=" + idModalitaDiPagamento + ", idCouponValido=" + idCouponValido
				+ ", disponibilitŗConnessione=" + disponibilitŗConnessione + ", allocazioneScontoPerStampa="
				+ allocazioneScontoPerStampa + ", primoArticolo=" + primoArticolo + ", articoliOmaggio="
				+ articoliOmaggio + ", totaleScontrino=" + totaleScontrino + ", noteInterne=" + noteInterne
				+ ", utenteInserimento=" + utenteInserimento + ", dataInserimento=" + dataInserimento
				+ ", utenteAggiornamento=" + utenteAggiornamento + ", dataAggiornamento=" + dataAggiornamento
				+ ", prioritaBestDeal=" + prioritaBestDeal + ", flagBestDeal=" + flagBestDeal + ", flagCouponRichiesto="
				+ flagCouponRichiesto + ", flagBruciaCoupon=" + flagBruciaCoupon + ", tipoStampaRedenzione="
				+ tipoStampaRedenzione + ", targetClienti=" + targetClienti + ", allocazioneScontoVentilazione="
				+ allocazioneScontoVentilazione + ", listPromoOffertaPdv=" + listPromoOffertaPdv
				+ ", listApplicazioneMerceologica=" + listApplicazioneMerceologica + ", listApplicazioneArticolo="
				+ listApplicazioneArticolo + ", listEsclusioneArticolo=" + listEsclusioneArticolo
				+ ", listPromoScaglione=" + listPromoScaglione + ", listPromoSegmenti=" + listPromoSegmenti
				+ ", listPromoSegmentiLocali=" + listPromoSegmentiLocali + "]";
	}

}
