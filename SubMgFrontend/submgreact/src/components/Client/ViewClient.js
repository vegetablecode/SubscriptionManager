import React, { Component } from "react";

class ClientTasks extends Component {
    state = {
        id: 1,
        clientIdentifier: "CLNT3",
        name: "Janusz Biznesu",
        nip: "49081193072",
        email: "PatrykKaczmarek@dayrep.com",
        phone: "66 684 34 81",
        agreement: {
            id: 2,
            tasksSequence: 3,
            clientIdentifier: "CLNT1",
            contractPeriod: 12,
            rate: 2,
            deviceName: "SHARP",
            freeBWCopies: 300,
            freeColorCopies: 50,
            priceBWCopy: 0.05,
            priceColorCopy: 0.12,
            quaterRate: false,
            tonerIncluded: true,
            printerLease: false,
            serviceAgreementOnly: false,
            copyLimitReached: false,
            invoicePaid: false,
            tasks: [
                {
                    id: 7,
                    clientSequence: "CLNT1-1",
                    clientIdentifier: "CLNT1",
                    summary: "task1",
                    priority: 3,
                    done: false
                },
                {
                    id: 8,
                    clientSequence: "CLNT1-1",
                    clientIdentifier: "CLNT1",
                    summary: "task2",
                    priority: 2,
                    done: true
                },
            ],
            "appointments": [
                {
                    id: 9,
                    clientIdentifier: "CLNT1",
                    summary: "task2",
                    priority: 2,
                    done: true
                },
            ]
        }
    }

    render() {
        return(
            <div>hello</div>
        );
    }
}

export default ClientTasks