class MemberList extends React.Component {

    getData() {
                                                         const data = [
            {id: "hong", name: '홍1', email: 'hong1@a.com'},
            {id: "king", name: '홍2', email: 'hong2@a.com'},
            {id: "kim", name: '홍3', email: 'hong3@a.com'}
        ];
        return data.map((m) => <MemberDetail key={m.id} member={m} />);
        
    }


    render() {
        return <div>{this.getData()}</div>
    }
}