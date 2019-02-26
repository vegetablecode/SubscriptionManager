import React, { Component } from "react";
import ClientCard from "./Client/ClientCard";

class Dashboard extends Component {
  render() {
    const client = {
      name: "Jan kowalski",
      date: "20.02.2019"
    }
    return (
      <div className="content">
        <div className="container-fluid">
          <div className="row">
            <div className="col-md-5">
              <div className="card  card-tasks">
                <div className="card-header ">
                  <h4 className="card-title">Wystawione faktury</h4>
                  <p className="card-category">Faktury oczekujące na zapłatę</p>
                </div>
                <div className="card-body ">
                  <div className="table-full-width">
                    <table className="table">
                      <tbody>
                      <ClientCard key={1} client={client} />
                      <ClientCard key={2} client={client} />
                      <ClientCard key={3} client={client} />
                      <ClientCard key={4} client={client} />
                      </tbody>
                    </table>
                  </div>
                </div>
                <div className="card-footer ">
                  <hr />
                  <div className="stats">
                    <i className="now-ui-icons loader_refresh spin" /> Zaktualizowano 3
                    minuty temu
                  </div>
                </div>
              </div>
            </div>
            <div className="col-md-5">
              <div className="card  card-tasks">
                <div className="card-header ">
                  <h4 className="card-title">Zbliżające się faktury</h4>
                  <p className="card-category">Faktury do wystawienia w tym tygodniu</p>
                </div>
                <div className="card-body ">
                  <div className="table-full-width">
                    <table className="table">
                      <tbody>
                      <ClientCard key={1} client={client} />
                      <ClientCard key={2} client={client} />
                      <ClientCard key={3} client={client} />
                      <ClientCard key={4} client={client} />
                      </tbody>
                    </table>
                  </div>
                </div>
                <div className="card-footer ">
                  <hr />
                  <div className="stats">
                    <i className="now-ui-icons loader_refresh spin" /> Zaktualizowano 3
                    minuty temu
                  </div>
                </div>
              </div>
            </div>
            <div className="col-md-5">
              <div className="card  card-tasks">
                <div className="card-header ">
                  <h4 className="card-title">Ważne zadania</h4>
                  <p className="card-category">Klienci z aktywnymi ważnymi zdaniami</p>
                </div>
                <div className="card-body ">
                  <div className="table-full-width">
                    <table className="table">
                      <tbody>
                      <ClientCard key={1} client={client} />
                      <ClientCard key={2} client={client} />
                      </tbody>
                    </table>
                  </div>
                </div>
                <div className="card-footer ">
                  <hr />
                  <div className="stats">
                    <i className="now-ui-icons loader_refresh spin" /> Zaktualizowano 3
                    minuty temu
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default Dashboard;
