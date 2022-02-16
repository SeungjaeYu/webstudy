class MemberList extends React.Component {

    getData() {
        const data = [
            {name: '홍1', email: 'hong1@a.com'},
            {name: '홍2', email: 'hong2@a.com'},
            {name: '홍3', email: 'hong3@a.com'}
        ];
        return data.map((m, idx) => {
            return (
                <div key={}>
                    <span>{m.name}</span>
                    <span>{m.email}</span>
                </div>
            );
        });
    }


    render() {
        return <div>{this.getData()}</div>
    }
}