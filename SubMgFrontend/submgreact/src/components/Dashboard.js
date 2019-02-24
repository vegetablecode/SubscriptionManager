import React, { Component } from "react";

class Dashboard extends Component {
  render() {
    return (
      <div className="content">
        <div className="container-fluid">
          <div className="row">
            <div className="col-md-5">
              <div className="card  card-tasks">
                <div className="card-header ">
                  <h4 className="card-title">Nieopłacone umowy</h4>
                  <p className="card-category">Klienci z umowami do zapłaty</p>
                </div>
                <div className="card-body ">
                  <div className="table-full-width">
                    <table className="table">
                      <tbody>
                        <tr>
                          <td>
                            <div className="form-check">siema1</div>
                          </td>
                          <td>
                            Sign contract for "What are conference organizers
                            afraid of?"
                          </td>
                          <td className="td-actions text-right">
                            <button
                              type="button"
                              rel="tooltip"
                              title="Edit Task"
                              className="btn btn-info btn-simple btn-link"
                            >
                              <i className="fa fa-edit" />
                            </button>
                            <button
                              type="button"
                              rel="tooltip"
                              title="Remove"
                              className="btn btn-danger btn-simple btn-link"
                            >
                              <i className="fa fa-times" />
                            </button>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <div className="form-check">siema</div>
                          </td>
                          <td>
                            Lines From Great Russian Literature? Or E-mails From
                            My Boss?
                          </td>
                          <td className="td-actions text-right">
                            <button
                              type="button"
                              rel="tooltip"
                              title="Edit Task"
                              className="btn btn-info btn-simple btn-link"
                            >
                              <i className="fa fa-edit" />
                            </button>
                            <button
                              type="button"
                              rel="tooltip"
                              title="Remove"
                              className="btn btn-danger btn-simple btn-link"
                            >
                              <i className="fa fa-times" />
                            </button>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <div className="form-check">siema3</div>
                          </td>
                          <td>
                            Flooded: One year later, assessing what was lost and
                            what was found when a ravaging rain swept through
                            metro Detroit
                          </td>
                          <td className="td-actions text-right">
                            <button
                              type="button"
                              rel="tooltip"
                              title="Edit Task"
                              className="btn btn-info btn-simple btn-link"
                            >
                              <i className="fa fa-edit" />
                            </button>
                            <button
                              type="button"
                              rel="tooltip"
                              title="Remove"
                              className="btn btn-danger btn-simple btn-link"
                            >
                              <i className="fa fa-times" />
                            </button>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <div className="form-check">siema4</div>
                          </td>
                          <td>
                            Create 4 Invisible User Experiences you Never Knew
                            About
                          </td>
                          <td className="td-actions text-right">
                            <button
                              type="button"
                              rel="tooltip"
                              title="Edit Task"
                              className="btn btn-info btn-simple btn-link"
                            >
                              <i className="fa fa-edit" />
                            </button>
                            <button
                              type="button"
                              rel="tooltip"
                              title="Remove"
                              className="btn btn-danger btn-simple btn-link"
                            >
                              <i className="fa fa-times" />
                            </button>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <div className="form-check">siema5</div>
                          </td>
                          <td>Read "Following makes Medium better"</td>
                          <td className="td-actions text-right">
                            <button
                              type="button"
                              rel="tooltip"
                              title="Edit Task"
                              className="btn btn-info btn-simple btn-link"
                            >
                              <i className="fa fa-edit" />
                            </button>
                            <button
                              type="button"
                              rel="tooltip"
                              title="Remove"
                              className="btn btn-danger btn-simple btn-link"
                            >
                              <i className="fa fa-times" />
                            </button>
                          </td>
                        </tr>
                        <tr>
                          <td>
                            <div className="form-check">siema6</div>
                          </td>
                          <td>Unfollow 5 enemies from twitter</td>
                          <td className="td-actions text-right">
                            <button
                              type="button"
                              rel="tooltip"
                              title="Edit Task"
                              className="btn btn-info btn-simple btn-link"
                            >
                              <i className="fa fa-edit" />
                            </button>
                            <button
                              type="button"
                              rel="tooltip"
                              title="Remove"
                              className="btn btn-danger btn-simple btn-link"
                            >
                              <i className="fa fa-times" />
                            </button>
                          </td>
                        </tr>
                      </tbody>
                    </table>
                  </div>
                </div>
                <div className="card-footer ">
                  <hr />
                  <div className="stats">
                    <i className="now-ui-icons loader_refresh spin" /> Updated 3
                    minutes ago
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
