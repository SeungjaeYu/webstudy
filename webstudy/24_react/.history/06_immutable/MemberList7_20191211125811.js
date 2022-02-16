class MemberList extends React.Component {

    getData() {
        const data = [
            {id: "1", name: '홍1', email: 'hong1@a.com'},
            {id: "2", name: '홍2', email: 'hong2@a.com'},
            {id: "3", name: '홍3', email: 'hong3@a.com'}
        ];
        return data.map((m, idx) => {
            return (
                <MemberDetail mem />
            );
        });
    }


    render() {
        return <div>{this.getData()}</div>
    }
}