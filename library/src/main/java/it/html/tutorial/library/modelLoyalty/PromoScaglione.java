package it.html.tutorial.library.modelLoyalty;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Size;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.map.annotate.JsonDeserialize;

public class PromoScaglione {
	
	@JsonProperty("id")
	private int id;
	
	@JsonProperty("id_promo_offerta")
	private int idPromoOfferta;
	
	@Size(min = 1, max = 500, message = "NOTE out of lenght (min len=1 / max len=500) ")
	@JsonProperty(value="note")
	private String note;
	
	@JsonProperty("ordine_di_applicazione")
	private int ordineDiApplicazione;
	
	@JsonProperty("cumulabile_ad_altri_scaglioni")
	private int cumulabileAdAltriScaglioni;
	
	@Size(min = 1, max = 20, message = "MODALITA'_EROGAZIONE out of lenght (min len=1 / max len=20) ")
	@JsonProperty(value="modalit‡_erogazione")
	private String modalit‡Erogazione;
	
	@Size(min = 1, max = 9, message = "MODALITA'_APPLICAZIONE out of lenght (min len=1 / max len=9) ")
	@JsonProperty(value="modalit‡_applicazione")
	private String modalit‡Applicazione;
	
	@JsonProperty("prendi")
	private int prendi;
	
	@JsonProperty("paghi")
	private int paghi;
	
	@JsonProperty("qta_articolo")
	private int qtaArticolo;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("sconto_percentuale")
	private float scontoPercentuale;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("sconto_euro")
	private float scontoEuro;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("prezzo_netto")
	private float prezzoNetto;
	
	@JsonProperty("pezzi_omaggio")
	private int pezziOmaggio;
	
	@JsonProperty("id_variabile_offerta")
	private int idVariabileOfferta;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("qta_variabile_offerta")
	private float qtaVariabileOfferta;
	
	@Size(min = 1, max = 16, message = "MODALITA'_APPLICAZIONE_VARIABILE out of lenght (min len=1 / max len=16) ")
	@JsonProperty(value="modalit‡_applicazione_variabile")
	private String modalit‡ApplicazioneVariabile;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("valore_coupon")
	private float valoreCoupon;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("data_inizio_validita_coupon")
	private Date dataInizioValiditaCoupon;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("data_fine_validita_coupon")
	private Date dataFineValiditaCoupon;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("valore_condizione_utiizzo_coupon")
	private float valoreCondizioneUtiizzoCoupon;
	
	@Size(min = 1, max = 50, message = "CODICE_COUPON_EMESSO out of lenght (min len=1 / max len=50) ")
	@JsonProperty(value="codice_coupon_emesso")
	private String codiceCouponEmesso;
	
	@Size(min = 1, max = 40, message = "UTENTE_INSERIMENTO out of lenght (min len=1 / max len=40) ")
	@JsonProperty("utente_inserimento")
	private String utenteInserimento;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("data_inserimento")
	private Date dataInserimento;
	
	@Size(min = 1, max = 40, message = "UTENTE_AGGIORNAMENTO out of lenght (min len=1 / max len=40) ")
	@JsonProperty("utente_aggiornamento")
	private String utenteAggiornamento;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("data_aggiornamento")
	private Date dataAggiornamento;
	
	@Size(min = 1, max = 3, message = "OPERATORE_LOGICO_CONDIZIONE out of lenght (min len=1 / max len=3) ")
	@JsonProperty("operatore_logico_condizione")
	private String operatoreLogicoCondizione;
	
	@Size(min = 1, max = 50, message = "TIPO_BENEFICIO out of lenght (min len=1 / max len=50) ")
	@JsonProperty("tipo_beneficio")
	private String tipoBeneficio;
	
	@Size(min = 1, max = 12, message = "VALIDITA'_COUPON out of lenght (min len=1 / max len=12) ")
	@JsonProperty("validit‡_coupon")
	private String validit‡Coupon;
	
	@Size(min = 1, max = 50, message = "VALIDITA'_COUPON_PERSONALIZZATA out of lenght (min len=1 / max len=50) ")
	@JsonProperty("validit‡_coupon_personalizzata")
	private String validit‡CouponPersonalizzata;
	
	@JsonProperty("giorni_da_data_emissione_coupon")
	private int giorniDaDataEmissioneCoupon;
	
	@JsonProperty("giorni_validit‡_coupon")
	private int giorniValidit‡Coupon;
	
	@JsonProperty("lunedÏ")
	private int lunedÏ;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("lun_da_ora")
	private Date lunDaOra;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("lun_a_ora")
	private Date lunAOra;
	
	@JsonProperty("martedÏ")
	private int martedÏ;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("mar_da_ora")
	private Date marDaOra;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("mar_a_ora")
	private Date marAOra;
	
	@JsonProperty("mercoledÏ")
	private int mercoledÏ;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("mer_da_ora")
	private Date merDaOra;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("mer_a_ora")
	private Date merAOra;
	
	@JsonProperty("giovedÏ")
	private int giovedÏ;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("gio_da_ora")
	private Date gioDaOra;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("gio_a_ora")
	private Date gioAOra;
	
	@JsonProperty("venerdÏ")
	private int venerdÏ;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("ven_da_ora")
	private Date venDaOra;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("ven_a_ora")
	private Date venAOra;
	
	@JsonProperty("sabato")
	private int sabato;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("sab_da_ora")
	private Date sabDaOra;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("sab_a_ora")
	private Date sabAOra;
	
	@JsonProperty("domenica")
	private int domenica;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("dom_da_ora")
	private Date domDaOra;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonLongDateDeSerializer.class)
	@JsonProperty("dom_a_ora")
	private Date domAOra;
	
	@JsonProperty("applica_in_cassa")
	private int applicaInCassa;

	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("qta_variabile_percentuale")
	private float qtaVariabilePercentuale;
	
	@Size(min = 1, max = 50, message = "DERIVAZIONE_VALORE_VARIABILE out of lenght (min len=1 / max len=50) ")
	@JsonProperty("derivazione_valore_variabile")
	private String derivazioneValoreVariabile;
	
	@Size(min = 1, max = 50, message = "ID_ATTRIBUTO_DINAMICO out of lenght (min len=1 / max len=50) ")
	@JsonProperty("id_attributo_dinamico")
	private String idAttributoDinamico;
	
	@JsonProperty("id_variabile_secondaria")
	private int idVariabileSecondaria;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("valore_massimo")
	private float valoreMassimo;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("spesa_massima")
	private float spesaMassima;
	
	@JsonProperty("qta_massima")
	private int qtaMassima;
	
	@Size(min = 1, max = 50, message = "TEMPISTICA_APPLICAZIONE out of lenght (min len=1 / max len=50) ")
	@JsonProperty("tempistica_applicazione")
	private String tempisticaApplicazione;
	
	@Size(min = 1, max = 50, message = "TIPO_DEDUZIONE_VARIABILE out of lenght (min len=1 / max len=50) ")
	@JsonProperty("tipo_deduzione_variabile")
	private String tipoDeduzioneVariabile;
	
	@JsonProperty("id_variabile_deduzione")
	private int idVariabileDeduzione;
	
	@Size(min = 1, max = 50, message = "DEDUZIONE_VALORE_VARIABILE out of lenght (min len=1 / max len=50) ")
	@JsonProperty("deduzione_valore_variabile")
	private String deduzioneValoreVariabile;
	
	@JsonDeserialize(using = it.html.tutorial.library.json.JsonFloatDeSerializer.class)
	@JsonProperty("qta_deduzione_variabile")
	private float qtaDeduzioneVariabile;
	
	@JsonProperty("id_segmento_sgancio")
	private int idSegmentoSgancio;
	
	@JsonProperty("id_segmento_aggancio")
	private int idSegmentoAggancio;
	
	@JsonProperty("id_messaggio")
	private int idMessaggio;
	
	@Size(min = 1, max = 3, message = "OPERATORE_LOGICO out of lenght (min len=1 / max len=3) ")
	@JsonProperty("operatore_logico")
	private String operatoreLogico;
	
	@Size(min = 1, max = 50, message = "APPLICABILITA' out of lenght (min len=1 / max len=50) ")
	@JsonProperty("applicabilit‡")
	private String applicabilit‡;
	
	@Size(min = 1, max = 10, message = "ID_DISPOSITIVO_MESSAGGIO out of lenght (min len=1 / max len=10) ")
	@JsonProperty("id_dispositivo_messaggio")
	private String idDispositivoMessaggio;
	
	@JsonProperty("promo_condizione")
    private List<PromoCondizione> listPromoCondizione;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdPromoOfferta() {
		return idPromoOfferta;
	}

	public void setIdPromoOfferta(int idPromoOfferta) {
		this.idPromoOfferta = idPromoOfferta;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getOrdineDiApplicazione() {
		return ordineDiApplicazione;
	}

	public void setOrdineDiApplicazione(int ordineDiApplicazione) {
		this.ordineDiApplicazione = ordineDiApplicazione;
	}

	public int getCumulabileAdAltriScaglioni() {
		return cumulabileAdAltriScaglioni;
	}

	public void setCumulabileAdAltriScaglioni(int cumulabileAdAltriScaglioni) {
		this.cumulabileAdAltriScaglioni = cumulabileAdAltriScaglioni;
	}

	public String getModalit‡Erogazione() {
		return modalit‡Erogazione;
	}

	public void setModalit‡Erogazione(String modalit‡Erogazione) {
		this.modalit‡Erogazione = modalit‡Erogazione;
	}

	public String getModalit‡Applicazione() {
		return modalit‡Applicazione;
	}

	public void setModalit‡Applicazione(String modalit‡Applicazione) {
		this.modalit‡Applicazione = modalit‡Applicazione;
	}

	public int getPrendi() {
		return prendi;
	}

	public void setPrendi(int prendi) {
		this.prendi = prendi;
	}

	public int getPaghi() {
		return paghi;
	}

	public void setPaghi(int paghi) {
		this.paghi = paghi;
	}

	public int getQtaArticolo() {
		return qtaArticolo;
	}

	public void setQtaArticolo(int qtaArticolo) {
		this.qtaArticolo = qtaArticolo;
	}

	public float getScontoPercentuale() {
		return scontoPercentuale;
	}

	public void setScontoPercentuale(float scontoPercentuale) {
		this.scontoPercentuale = scontoPercentuale;
	}

	public float getScontoEuro() {
		return scontoEuro;
	}

	public void setScontoEuro(float scontoEuro) {
		this.scontoEuro = scontoEuro;
	}

	public float getPrezzoNetto() {
		return prezzoNetto;
	}

	public void setPrezzoNetto(float prezzoNetto) {
		this.prezzoNetto = prezzoNetto;
	}

	public int getPezziOmaggio() {
		return pezziOmaggio;
	}

	public void setPezziOmaggio(int pezziOmaggio) {
		this.pezziOmaggio = pezziOmaggio;
	}

	public int getIdVariabileOfferta() {
		return idVariabileOfferta;
	}

	public void setIdVariabileOfferta(int idVariabileOfferta) {
		this.idVariabileOfferta = idVariabileOfferta;
	}

	public float getQtaVariabileOfferta() {
		return qtaVariabileOfferta;
	}

	public void setQtaVariabileOfferta(float qtaVariabileOfferta) {
		this.qtaVariabileOfferta = qtaVariabileOfferta;
	}

	public String getModalit‡ApplicazioneVariabile() {
		return modalit‡ApplicazioneVariabile;
	}

	public void setModalit‡ApplicazioneVariabile(String modalit‡ApplicazioneVariabile) {
		this.modalit‡ApplicazioneVariabile = modalit‡ApplicazioneVariabile;
	}

	public float getValoreCoupon() {
		return valoreCoupon;
	}

	public void setValoreCoupon(float valoreCoupon) {
		this.valoreCoupon = valoreCoupon;
	}

	public Date getDataInizioValiditaCoupon() {
		return dataInizioValiditaCoupon;
	}

	public void setDataInizioValiditaCoupon(Date dataInizioValiditaCoupon) {
		this.dataInizioValiditaCoupon = dataInizioValiditaCoupon;
	}

	public Date getDataFineValiditaCoupon() {
		return dataFineValiditaCoupon;
	}

	public void setDataFineValiditaCoupon(Date dataFineValiditaCoupon) {
		this.dataFineValiditaCoupon = dataFineValiditaCoupon;
	}

	public float getValoreCondizioneUtiizzoCoupon() {
		return valoreCondizioneUtiizzoCoupon;
	}

	public void setValoreCondizioneUtiizzoCoupon(float valoreCondizioneUtiizzoCoupon) {
		this.valoreCondizioneUtiizzoCoupon = valoreCondizioneUtiizzoCoupon;
	}

	public String getCodiceCouponEmesso() {
		return codiceCouponEmesso;
	}

	public void setCodiceCouponEmesso(String codiceCouponEmesso) {
		this.codiceCouponEmesso = codiceCouponEmesso;
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

	public String getOperatoreLogicoCondizione() {
		return operatoreLogicoCondizione;
	}

	public void setOperatoreLogicoCondizione(String operatoreLogicoCondizione) {
		this.operatoreLogicoCondizione = operatoreLogicoCondizione;
	}

	public String getTipoBeneficio() {
		return tipoBeneficio;
	}

	public void setTipoBeneficio(String tipoBeneficio) {
		this.tipoBeneficio = tipoBeneficio;
	}

	public String getValidit‡Coupon() {
		return validit‡Coupon;
	}

	public void setValidit‡Coupon(String validit‡Coupon) {
		this.validit‡Coupon = validit‡Coupon;
	}

	public String getValidit‡CouponPersonalizzata() {
		return validit‡CouponPersonalizzata;
	}

	public void setValidit‡CouponPersonalizzata(String validit‡CouponPersonalizzata) {
		this.validit‡CouponPersonalizzata = validit‡CouponPersonalizzata;
	}

	public int getGiorniDaDataEmissioneCoupon() {
		return giorniDaDataEmissioneCoupon;
	}

	public void setGiorniDaDataEmissioneCoupon(int giorniDaDataEmissioneCoupon) {
		this.giorniDaDataEmissioneCoupon = giorniDaDataEmissioneCoupon;
	}

	public int getGiorniValidit‡Coupon() {
		return giorniValidit‡Coupon;
	}

	public void setGiorniValidit‡Coupon(int giorniValidit‡Coupon) {
		this.giorniValidit‡Coupon = giorniValidit‡Coupon;
	}

	public int getLunedÏ() {
		return lunedÏ;
	}

	public void setLunedÏ(int lunedÏ) {
		this.lunedÏ = lunedÏ;
	}

	public Date getLunDaOra() {
		return lunDaOra;
	}

	public void setLunDaOra(Date lunDaOra) {
		this.lunDaOra = lunDaOra;
	}

	public Date getLunAOra() {
		return lunAOra;
	}

	public void setLunAOra(Date lunAOra) {
		this.lunAOra = lunAOra;
	}

	public int getMartedÏ() {
		return martedÏ;
	}

	public void setMartedÏ(int martedÏ) {
		this.martedÏ = martedÏ;
	}

	public Date getMarDaOra() {
		return marDaOra;
	}

	public void setMarDaOra(Date marDaOra) {
		this.marDaOra = marDaOra;
	}

	public Date getMarAOra() {
		return marAOra;
	}

	public void setMarAOra(Date marAOra) {
		this.marAOra = marAOra;
	}

	public int getMercoledÏ() {
		return mercoledÏ;
	}

	public void setMercoledÏ(int mercoledÏ) {
		this.mercoledÏ = mercoledÏ;
	}

	public Date getMerDaOra() {
		return merDaOra;
	}

	public void setMerDaOra(Date merDaOra) {
		this.merDaOra = merDaOra;
	}

	public Date getMerAOra() {
		return merAOra;
	}

	public void setMerAOra(Date merAOra) {
		this.merAOra = merAOra;
	}

	public int getGiovedÏ() {
		return giovedÏ;
	}

	public void setGiovedÏ(int giovedÏ) {
		this.giovedÏ = giovedÏ;
	}

	public Date getGioDaOra() {
		return gioDaOra;
	}

	public void setGioDaOra(Date gioDaOra) {
		this.gioDaOra = gioDaOra;
	}

	public Date getGioAOra() {
		return gioAOra;
	}

	public void setGioAOra(Date gioAOra) {
		this.gioAOra = gioAOra;
	}

	public int getVenerdÏ() {
		return venerdÏ;
	}

	public void setVenerdÏ(int venerdÏ) {
		this.venerdÏ = venerdÏ;
	}

	public Date getVenDaOra() {
		return venDaOra;
	}

	public void setVenDaOra(Date venDaOra) {
		this.venDaOra = venDaOra;
	}

	public Date getVenAOra() {
		return venAOra;
	}

	public void setVenAOra(Date venAOra) {
		this.venAOra = venAOra;
	}

	public int getSabato() {
		return sabato;
	}

	public void setSabato(int sabato) {
		this.sabato = sabato;
	}

	public Date getSabDaOra() {
		return sabDaOra;
	}

	public void setSabDaOra(Date sabDaOra) {
		this.sabDaOra = sabDaOra;
	}

	public Date getSabAOra() {
		return sabAOra;
	}

	public void setSabAOra(Date sabAOra) {
		this.sabAOra = sabAOra;
	}

	public int getDomenica() {
		return domenica;
	}

	public void setDomenica(int domenica) {
		this.domenica = domenica;
	}

	public Date getDomDaOra() {
		return domDaOra;
	}

	public void setDomDaOra(Date domDaOra) {
		this.domDaOra = domDaOra;
	}

	public Date getDomAOra() {
		return domAOra;
	}

	public void setDomAOra(Date domAOra) {
		this.domAOra = domAOra;
	}

	public int getApplicaInCassa() {
		return applicaInCassa;
	}

	public void setApplicaInCassa(int applicaInCassa) {
		this.applicaInCassa = applicaInCassa;
	}

	public float getQtaVariabilePercentuale() {
		return qtaVariabilePercentuale;
	}

	public void setQtaVariabilePercentuale(float qtaVariabilePercentuale) {
		this.qtaVariabilePercentuale = qtaVariabilePercentuale;
	}

	public String getDerivazioneValoreVariabile() {
		return derivazioneValoreVariabile;
	}

	public void setDerivazioneValoreVariabile(String derivazioneValoreVariabile) {
		this.derivazioneValoreVariabile = derivazioneValoreVariabile;
	}

	public String getIdAttributoDinamico() {
		return idAttributoDinamico;
	}

	public void setIdAttributoDinamico(String idAttributoDinamico) {
		this.idAttributoDinamico = idAttributoDinamico;
	}

	public int getIdVariabileSecondaria() {
		return idVariabileSecondaria;
	}

	public void setIdVariabileSecondaria(int idVariabileSecondaria) {
		this.idVariabileSecondaria = idVariabileSecondaria;
	}

	public float getValoreMassimo() {
		return valoreMassimo;
	}

	public void setValoreMassimo(float valoreMassimo) {
		this.valoreMassimo = valoreMassimo;
	}

	public float getSpesaMassima() {
		return spesaMassima;
	}

	public void setSpesaMassima(float spesaMassima) {
		this.spesaMassima = spesaMassima;
	}

	public int getQtaMassima() {
		return qtaMassima;
	}

	public void setQtaMassima(int qtaMassima) {
		this.qtaMassima = qtaMassima;
	}

	public String getTempisticaApplicazione() {
		return tempisticaApplicazione;
	}

	public void setTempisticaApplicazione(String tempisticaApplicazione) {
		this.tempisticaApplicazione = tempisticaApplicazione;
	}

	public String getTipoDeduzioneVariabile() {
		return tipoDeduzioneVariabile;
	}

	public void setTipoDeduzioneVariabile(String tipoDeduzioneVariabile) {
		this.tipoDeduzioneVariabile = tipoDeduzioneVariabile;
	}

	public int getIdVariabileDeduzione() {
		return idVariabileDeduzione;
	}

	public void setIdVariabileDeduzione(int idVariabileDeduzione) {
		this.idVariabileDeduzione = idVariabileDeduzione;
	}

	public String getDeduzioneValoreVariabile() {
		return deduzioneValoreVariabile;
	}

	public void setDeduzioneValoreVariabile(String deduzioneValoreVariabile) {
		this.deduzioneValoreVariabile = deduzioneValoreVariabile;
	}

	public float getQtaDeduzioneVariabile() {
		return qtaDeduzioneVariabile;
	}

	public void setQtaDeduzioneVariabile(float qtaDeduzioneVariabile) {
		this.qtaDeduzioneVariabile = qtaDeduzioneVariabile;
	}

	public int getIdSegmentoSgancio() {
		return idSegmentoSgancio;
	}

	public void setIdSegmentoSgancio(int idSegmentoSgancio) {
		this.idSegmentoSgancio = idSegmentoSgancio;
	}

	public int getIdSegmentoAggancio() {
		return idSegmentoAggancio;
	}

	public void setIdSegmentoAggancio(int idSegmentoAggancio) {
		this.idSegmentoAggancio = idSegmentoAggancio;
	}

	public int getIdMessaggio() {
		return idMessaggio;
	}

	public void setIdMessaggio(int idMessaggio) {
		this.idMessaggio = idMessaggio;
	}

	public String getOperatoreLogico() {
		return operatoreLogico;
	}

	public void setOperatoreLogico(String operatoreLogico) {
		this.operatoreLogico = operatoreLogico;
	}

	public String getApplicabilit‡() {
		return applicabilit‡;
	}

	public void setApplicabilit‡(String applicabilit‡) {
		this.applicabilit‡ = applicabilit‡;
	}

	public String getIdDispositivoMessaggio() {
		return idDispositivoMessaggio;
	}

	public void setIdDispositivoMessaggio(String idDispositivoMessaggio) {
		this.idDispositivoMessaggio = idDispositivoMessaggio;
	}

	public List<PromoCondizione> getListPromoCondizione() {
		return listPromoCondizione;
	}

	public void setListPromoCondizione(List<PromoCondizione> listPromoCondizione) {
		this.listPromoCondizione = listPromoCondizione;
	}

	@Override
	public String toString() {
		return "PromoScaglione [id=" + id + ", idPromoOfferta=" + idPromoOfferta + ", note=" + note
				+ ", ordineDiApplicazione=" + ordineDiApplicazione + ", cumulabileAdAltriScaglioni="
				+ cumulabileAdAltriScaglioni + ", modalit‡Erogazione=" + modalit‡Erogazione + ", modalit‡Applicazione="
				+ modalit‡Applicazione + ", prendi=" + prendi + ", paghi=" + paghi + ", qtaArticolo=" + qtaArticolo
				+ ", scontoPercentuale=" + scontoPercentuale + ", scontoEuro=" + scontoEuro + ", prezzoNetto="
				+ prezzoNetto + ", pezziOmaggio=" + pezziOmaggio + ", idVariabileOfferta=" + idVariabileOfferta
				+ ", qtaVariabileOfferta=" + qtaVariabileOfferta + ", modalit‡ApplicazioneVariabile="
				+ modalit‡ApplicazioneVariabile + ", valoreCoupon=" + valoreCoupon + ", dataInizioValiditaCoupon="
				+ dataInizioValiditaCoupon + ", dataFineValiditaCoupon=" + dataFineValiditaCoupon
				+ ", valoreCondizioneUtiizzoCoupon=" + valoreCondizioneUtiizzoCoupon + ", codiceCouponEmesso="
				+ codiceCouponEmesso + ", utenteInserimento=" + utenteInserimento + ", dataInserimento="
				+ dataInserimento + ", utenteAggiornamento=" + utenteAggiornamento + ", dataAggiornamento="
				+ dataAggiornamento + ", operatoreLogicoCondizione=" + operatoreLogicoCondizione + ", tipoBeneficio="
				+ tipoBeneficio + ", validit‡Coupon=" + validit‡Coupon + ", validit‡CouponPersonalizzata="
				+ validit‡CouponPersonalizzata + ", giorniDaDataEmissioneCoupon=" + giorniDaDataEmissioneCoupon
				+ ", giorniValidit‡Coupon=" + giorniValidit‡Coupon + ", lunedÏ=" + lunedÏ + ", lunDaOra=" + lunDaOra
				+ ", lunAOra=" + lunAOra + ", martedÏ=" + martedÏ + ", marDaOra=" + marDaOra + ", marAOra=" + marAOra
				+ ", mercoledÏ=" + mercoledÏ + ", merDaOra=" + merDaOra + ", merAOra=" + merAOra + ", giovedÏ="
				+ giovedÏ + ", gioDaOra=" + gioDaOra + ", gioAOra=" + gioAOra + ", venerdÏ=" + venerdÏ + ", venDaOra="
				+ venDaOra + ", venAOra=" + venAOra + ", sabato=" + sabato + ", sabDaOra=" + sabDaOra + ", sabAOra="
				+ sabAOra + ", domenica=" + domenica + ", domDaOra=" + domDaOra + ", domAOra=" + domAOra
				+ ", applicaInCassa=" + applicaInCassa + ", qtaVariabilePercentuale=" + qtaVariabilePercentuale
				+ ", derivazioneValoreVariabile=" + derivazioneValoreVariabile + ", idAttributoDinamico="
				+ idAttributoDinamico + ", idVariabileSecondaria=" + idVariabileSecondaria + ", valoreMassimo="
				+ valoreMassimo + ", spesaMassima=" + spesaMassima + ", qtaMassima=" + qtaMassima
				+ ", tempisticaApplicazione=" + tempisticaApplicazione + ", tipoDeduzioneVariabile="
				+ tipoDeduzioneVariabile + ", idVariabileDeduzione=" + idVariabileDeduzione
				+ ", deduzioneValoreVariabile=" + deduzioneValoreVariabile + ", qtaDeduzioneVariabile="
				+ qtaDeduzioneVariabile + ", idSegmentoSgancio=" + idSegmentoSgancio + ", idSegmentoAggancio="
				+ idSegmentoAggancio + ", idMessaggio=" + idMessaggio + ", operatoreLogico=" + operatoreLogico
				+ ", applicabilit‡=" + applicabilit‡ + ", idDispositivoMessaggio=" + idDispositivoMessaggio
				+ ", listPromoCondizione=" + listPromoCondizione + "]";
	}
	
}
