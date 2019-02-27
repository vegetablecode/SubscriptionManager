import React, { Component } from "react";

class EditClient extends Component {
  state = {
    serviceAgreement: "true"
  };

  handleChange = event => {
    const { name, value, type, checked } = event.target;
    type === "checkbox"
      ? this.setState({ [name]: checked })
      : this.setState({ [name]: value });
  };

  render() {
    return (
      <div className="content">
        <div className="container-fluid">
          <div className="row">
            <div className="col-md-12">
              <div className="card">
                <div className="card-header">
                  <h4 className="card-title">Dodaj nowego klienta</h4>
                </div>
                <div className="card-body">
                  <form>
                    <div className="row">
                      <div className="col-md-5 pr-1">
                        <div className="form-group">
                          <label>Nazwa klienta</label>
                          <input
                            type="text"
                            className="form-control"
                            disabled=""
                            placeholder="np. Jan Kowalski"
                            value=""
                          />
                        </div>
                      </div>
                      <div className="col-md-3 px-1">
                        <div className="form-group">
                          <label>NIP</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder="np. 1234567890"
                            value=""
                          />
                        </div>
                      </div>
                      <div className="col-md-4 pl-1">
                        <div className="form-group">
                          <label>Adres e-mail</label>
                          <input
                            type="email"
                            className="form-control"
                            placeholder="np. jan@kowalski.pl"
                          />
                        </div>
                      </div>
                    </div>
                    <div className="row">
                      <div className="col-md-6 pr-1">
                        <div className="form-group">
                          <label>Telefon</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder="np. 123-456-789"
                            value=""
                          />
                        </div>
                      </div>
                      <div className="col-md-6 pl-1">
                        <div className="form-group">
                          <label>Identyfikator (unikalny)</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder="np. CLNT1"
                            value=""
                          />
                        </div>
                      </div>
                    </div>
                    <hr />
                    <div className="row">
                      <div className="col-md-4 pr-1">
                        <div className="form-group">
                          <label>Nazwa urządzenia</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder="np. Sharp MX-2300"
                            value=""
                          />
                        </div>
                      </div>
                      <div className="col-md-4 px-1">
                        <div className="form-group">
                          <label>Stan licznika BW</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder=""
                            value=""
                            disabled={
                              this.state.serviceAgreement === "true"
                                ? ""
                                : "disabled"
                            }
                          />
                        </div>
                      </div>
                      <div className="col-md-4 pl-1">
                        <div className="form-group">
                          <label>Stan licznika KOLOR</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder=""
                            value=""
                            disabled={
                              this.state.serviceAgreement === "true"
                                ? ""
                                : "disabled"
                            }
                          />
                        </div>
                      </div>
                    </div>
                    <div className="row">
                      <div className="col-md-6 pr-1">
                        <div className="form-group">
                          <label>Limit kopii BW</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder=""
                            value=""
                            disabled={
                              this.state.serviceAgreement === "true"
                                ? ""
                                : "disabled"
                            }
                          />
                        </div>
                      </div>
                      <div className="col-md-6 pl-1">
                        <div className="form-group">
                          <label>Cena za kopię BW (powyżej limitu)</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder=""
                            value=""
                            disabled={
                              this.state.serviceAgreement === "true"
                                ? ""
                                : "disabled"
                            }
                          />
                        </div>
                      </div>
                    </div>
                    <div className="row">
                      <div className="col-md-6 pr-1">
                        <div className="form-group">
                          <label>Limit kopii KOLOR</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder=""
                            value=""
                            disabled={
                              this.state.serviceAgreement === "true"
                                ? ""
                                : "disabled"
                            }
                          />
                        </div>
                      </div>
                      <div className="col-md-6 pl-1">
                        <div className="form-group">
                          <label>Cena za kopię KOLOR (powyżej limitu)</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder=""
                            value=""
                            disabled={
                              this.state.serviceAgreement === "true"
                                ? ""
                                : "disabled"
                            }
                          />
                        </div>
                      </div>
                    </div>
                    <hr />
                    <div className="row">
                      <div className="col-md-4 pr-1">
                        <div className="form-group">
                          <label>Okres umowy (w miesiącach)</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder=""
                            value=""
                          />
                        </div>
                      </div>
                      <div className="col-md-4 px-1">
                        <div className="form-group">
                          <label>Ryczałt</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder=""
                            value=""
                          />
                        </div>
                      </div>
                      <div className="col-md-4 pl-1">
                        <div className="form-group">
                          <label>Data rozpoczęcia umowy</label>
                          <input
                            type="text"
                            className="form-control"
                            placeholder=""
                            value=""
                          />
                        </div>
                      </div>
                    </div>
                    <div>
                      <label>
                        <input
                          type="checkbox"
                          name=""
                          disabled={
                            this.state.serviceAgreement === "true"
                              ? ""
                              : "disabled"
                          }
                        />{" "}
                        Rozliczenie kwartalne
                      </label>
                    </div>
                    <div>
                      <label>
                        <input
                          type="checkbox"
                          name=""
                          disabled={
                            this.state.serviceAgreement === "true"
                              ? ""
                              : "disabled"
                          }
                        />{" "}
                        Tonery zawarte w umowie
                      </label>
                    </div>
                    <div>
                      <label>
                        <input
                          type="checkbox"
                          name=""
                          disabled={
                            this.state.serviceAgreement === "true"
                              ? ""
                              : "disabled"
                          }
                        />{" "}
                        Dzierżawa urządzenia
                      </label>
                    </div>
                    <button
                      type="submit"
                      className="btn btn-info btn-fill pull-right"
                    >
                      Dodaj klienta
                    </button>
                    <div className="clearfix" />
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default EditClient;