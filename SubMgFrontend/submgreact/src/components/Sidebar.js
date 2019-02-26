import React, { Component } from "react";
import sidebarImg from "../assets/img/sidebar-5.jpg";
import { NavLink, withRouter } from "react-router-dom";

class Sidebar extends Component {
  render() {
    return (
      <div className="sidebar" data-color="blue" data-img={sidebarImg}>
        <div className="sidebar-wrapper">
          <div className="logo">
            <NavLink to="/" className="simple-text">
              elbiSerwis
            </NavLink>
          </div>
          <ul className="nav">
            <li className="nav-item active">
              <NavLink to="/">
                <a className="nav-link">
                  <i className="nc-icon nc-chart-pie-35" />
                  <p>Panel główny</p>
                </a>
              </NavLink>
            </li>
            <li>
              <NavLink to="/addClient">
                <a className="nav-link">
                  <i className="nc-icon nc-circle-09" />
                  <p>Dodaj klienta</p>
                </a>
              </NavLink>
            </li>
            <li>
            <NavLink to="/clientTasks">
              <a className="nav-link">
                <i className="nc-icon nc-notes" />
                <p>Zadania</p>
              </a>
              </NavLink>
            </li>
            <li>
              <a className="nav-link" href="./typography.html">
                <i className="nc-icon nc-paper-2" />
                <p>Zarządzaj umowami</p>
              </a>
            </li>
            <li>
              <a className="nav-link" href="./maps.html">
                <i className="nc-icon nc-bullet-list-67" />
                <p>Kalendarz</p>
              </a>
            </li>
            <li>
              <a className="nav-link" href="./notifications.html">
                <i className="nc-icon nc-bell-55" />
                <p>Powiadomienia</p>
              </a>
            </li>
          </ul>
        </div>
      </div>
    );
  }
}

export default withRouter(Sidebar);
